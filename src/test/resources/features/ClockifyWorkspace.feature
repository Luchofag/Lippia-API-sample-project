Feature: Workspace
  COMO usuario de Clockify
  QUIERO ver las configuraciones de mi Worckspace
  PARA llevar un buen control de mis horas de trabajo y el de mis empleados

  Scenario Outline: Consulta Workspace resultado exitoso
    Given Mi cuenta creada en clockify y mi X-Api-Key geneada
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then Obtengo los datos de mi Workspace
    @Workspace
    Examples:
      | operation | entity    | jsonName     | status |
      | GET       | WORKSPACE | workspace/rq | 200    |

  Scenario Outline: Consulta Workspace resultado erroneo
    Given X-Api-Key invalido
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    @Workspace
    Examples:
      | operation | entity | jsonName     | status |
      | GET       | ERROR  | workspace/rq | 401    |


  Scenario Outline: Consulta projects
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and 'api-key:NDRmZWUwYzEtOTZhMS00NDk5LWJkZWItY2FiNmY1MjQ3NGNh,wSpace:614b795a8fc8f836af59328a'
    And se obtuvo el status code <status>
    Then se valida que el id no sea null
    @Workspace
    Examples:
      | operation | entity  | jsonName   | status |
      | GET       | PROJECT | project/rq | 200    |

  Scenario Outline: Consulta projects
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then se obtuvo el response esperado en <entity> con el <response>
    Examples:
      | operation | entity | jsonName       | response       | status |
      | GET       | ERROR  | project/rq_401 | project/rs_401 | 401    |

  Scenario Outline: Consulta projects
    #Given Mi cuenta creada en clockify y mi X-Api-Key geneada
    And un id_WSpace
    When I perform a '<operation>' to 'PROJECTS' endpoint with the 'project/rq' and ''
    And se obtuvo el status code <status>
    Then se valida que el id no sea null
    Given un id project de la respuesta
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    @Project
    Examples:
      | operation | entity  | jsonName     | status |
      | GET       | PROJECT | projectID/rq | 200    |

  @prueba
  Scenario Outline: Consulta projects
    #Given Mi cuenta creada en clockify y mi X-Api-Key geneada
    And un id_WSpace
    When I perform a 'GET' to 'PROJECTS' endpoint with the 'project/rq' and ''
    And se obtuvo el status code <status>
    Then se valida que el id no sea null
    Given un id project de la respuesta
    And un nombre '<name>'
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    And se valida que el nombre fue editado '<name>'

    @Project
    Examples:
      | operation | entity  | name     | jsonName            | status |
      | PUT       | PROJECT | Academy1 | projectID/editar/rq | 200    |
      | PUT       | PROJECT | Academy2 | projectID/editar/rq | 200    |
      | PUT       | PROJECT | Academy3 | projectID/editar/rq | 200    |
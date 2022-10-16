@Todo
Feature: Project
  Background:
    Given se inicializan los parametros
  @Exitoso
  Scenario Outline: Consultar project resultado exitoso
    Given Mi cuenta en clockify y mi X-Api-Key geneada
    And un id_WSpace
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Examples:
      | operation | entity  | jsonName   | status |
      | GET       | PROJECT | project/rq | 200    |

  @Error401
  Scenario Outline: Consulta Workspace resultado exitoso
    Given X-Api-Key invalido
    And un id_WSpace
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    And se obtuvo el response esperado en <entity> con el <response>
    Examples:
      | operation | entity | jsonName   | status | response    |
      | GET       | ERROR  | project/rq | 401    | project/401 |

  @ByID
  Scenario Outline: Consulta Workspace resultado exitoso
    Given Mi cuenta en clockify y mi X-Api-Key geneada
    And un id_WSpace
    When I perform a '<operation>' to 'PROJECTS' endpoint with the 'project/rq' and ''
    And se obtuvo el status code <status>
    Then se valida que el id no sea null
    Given un id project de la respuesta
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Examples:
      | operation | entity | jsonName   | status |
      | GET       | PROJECT  | projectById/rq | 200   |
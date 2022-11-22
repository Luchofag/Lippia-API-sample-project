Feature: Project

  Background:
    Given se inicializan los parametros

  Scenario Outline: Consultar Time Entries
    Given Mi cuenta en clockify y mi X-Api-Key generada
    And un workspace y un userId
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Examples:
      | operation | entity       | jsonName       | status |
      | GET       | TIME_ENTRIES | timeEntries/rq | 200    |

  Scenario Outline: Agregar horas a un proyecto.
    Given Mi cuenta en clockify y mi X-Api-Key generada
    And un workspace y un userId
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Examples:
      | operation | entity       | jsonName           | status |
      | POST      | TIME_ENTRIES | postTimeEntries/rq | 201    |

  Scenario Outline: Editar la descripcion de algún registro de hora.
    Given Mi cuenta en clockify y mi X-Api-Key generada
    And un workspace y un Time entry Id
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Examples:
      | operation | entity       | jsonName          | status |
      | PUT       | TIME_ENTRIES | putTimeEntries/rq | 200    |

  @Exitoso
  Scenario Outline: Eliminar hora registrada.
    Given Mi cuenta en clockify y mi X-Api-Key generada
    And un workspace y un Time entry Id
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Examples:
      | operation | entity       | jsonName          | status |
      | delete    | TIME_ENTRIES | putTimeEntries/rq | 204    |
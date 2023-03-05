Feature: Eliminacion de una entrada

  Background:
    Given Se inicializan los parametros

  @Exitoso
  Scenario Outline: Eliminar hora registrada.
    Given Que tengo mi cuenta en clockify y mi X-Api-Key generada
    And un workspaceID '<wspaceid>'
    When I perform a 'POST' to '<entity>' endpoint with the 'postTimeEntries/rq' and ''
    And se obtuvo el status code 201
    And Guardo el id del time entry generado
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Examples:
      | operation | entity       | jsonName          | status | wspaceid                 |
      | delete    | TIME_ENTRIES | deleteTimeEntry/rq | 204    | 63793764211dc7053733b8bd |
Feature: Delete
  @Delete
  Background:
    Given Se inicializan los parametros
  Scenario Outline: Eliminar hora registrada.
    Given Que tengo mi cuenta en clockify y mi X-Api-Key generada
    And un workspaceID y un Time entry Id
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Examples:
      | operation | entity       | jsonName          | status |
      | delete    | TIME_ENTRIES | putTimeEntries/rq | 204    |
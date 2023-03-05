Feature: Modificacion de una entrada

  Background:
    Given Se inicializan los parametros
  @Put
  Scenario Outline: Editar la descripcion de algún registro de hora.
    Given Que tengo mi cuenta en clockify y mi X-Api-Key generada
    And un workspaceID y un Time entry Id
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Examples:
      | operation | entity       | jsonName          | status |
      | PUT       | TIME_ENTRIES | putTimeEntries/rq | 200    |
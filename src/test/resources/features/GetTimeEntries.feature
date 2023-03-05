Feature: Realizar la consulta de las entradas.

  Background:
    Given Se inicializan los parametros
  @Get
  Scenario Outline: Consultar Time Entries
    Given Que tengo mi cuenta en clockify y mi X-Api-Key generada
    And un workspaceID y un userId
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then Obtengo los datos de mi Time entry
    Examples:
      | operation | entity       | jsonName       | status |
      | GET       | TIME_ENTRIES | timeEntries/rq | 200    |



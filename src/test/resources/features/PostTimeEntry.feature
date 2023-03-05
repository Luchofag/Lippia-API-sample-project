Feature: Ingreso de una entrada

  Background:
    Given Se inicializan los parametros
  @Post
  Scenario Outline: Agregar horas a un proyecto.
    Given Que tengo mi cuenta en clockify y mi X-Api-Key generada
    And un workspaceID y un userId
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Examples:
      | operation | entity       | jsonName           | status |
      | POST      | TIME_ENTRIES | postTimeEntries/rq | 201    |
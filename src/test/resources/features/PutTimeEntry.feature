Feature: Modificacion de una entrada

  Background:
    Given Se inicializan los parametros

  @Put
  Scenario Outline: Editar la descripcion de algún registro de hora.
    Given Que tengo mi cuenta en clockify y mi X-Api-Key generada
    And un workspaceID '<wspaceid>'
    When I perform a 'POST' to '<entity>' endpoint with the 'postTimeEntries/rq' and ''
    And se obtuvo el status code 201
    And Guardo el id del time entry generado
    And Asigno la nueva '<description>' del time entry
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then Verifico que el campo descripcion tenga la leyenda '<description>'
    Examples:
      | operation | entity       | jsonName          | status | wspaceid                 | description      |
      | PUT       | TIME_ENTRIES | putTimeEntries/rq | 200    | 63793764211dc7053733b8bd | cambio realizado |
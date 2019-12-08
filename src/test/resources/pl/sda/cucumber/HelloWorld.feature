Feature: Powitania w różnych językach

  Scenario Outline: Powitanie w jezyku polskim
    Given Stworzona instancja klasy obiektu HelloWorld
    When Wprowadzono jezyk <jezyk>
    Then Wyswietlony zostal komunikat <powitanie>

    Examples:
      | jezyk | powitanie        |
      | "pl"  | "Witaj Świecie!" |
      | "en"  | "Hello world!"   |
      | "cs"  | "Cos"            |
      | "de"  | "Jezyk nieznany!" |





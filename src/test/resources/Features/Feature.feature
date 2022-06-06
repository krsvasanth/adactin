Feature: Adactin Web Application Validation

  Backround:
    Given User Launch Adactin Web Application
    Then User verify Adactin Login Page is Displayed

  Scenario: TC01_Validation of Addactin Web Application with invalid Credentials
    When User enters invalid username and password
    And User clicks Login button
    Then User verify Error message is Displayed

  Scenario Outline: TC02_Validation of Addactin Web Application
    When User enters valid "<username>" and "<password>"
    And User clicks Login button
    Then User verify Search Hotel page is displayed
    When User Selects valid "<location>","<hotel>" and "<roomType>"
    And User clicks search button
    Then User verify Select Hotel page is displayed
    When User clicks radio button and clicks continue button
    Then User verify Book a Hotel page is displayed
    When User enters valid "<firstName>","<lastName>" and "<billingAddress>"
    When User enters valid "<cardNumber>","<cardType>","<expMonth>","<expYear>" and "<cvv>"
    And USer clicks Book now button

    Examples: 
      | username   | password   | location | hotel          | roomType | firstName | lastName | billingAddress  | cardNumber       | cardType         | expMonth | expYear | cvv |
      | krsvasanth | Hai@123456 | Sydney   | Hotel Creek    | Deluxe   | Vasantha  | Kumar    | Maraimalainagar | 4523675689674325 | VISA             | March    |    2022 | 564 |
      | krsvasanth | Hai@123456 | Sydney   | Hotel Sunshine | Deluxe   | Vasantha  | Kumar    | Chennai         | 4523632684574374 | VISA             | February |    2022 | 786 |
      | krsvasanth | Hai@123456 | Sydney   | Hotel Hervey   | Deluxe   | Vasantha  | Kumar    | Chennai         | 4523632684574374 | American Express | May      |    2022 | 897 |
      | krsvasanth | Hai@123456 | Sydney   | Hotel Cornice  | Deluxe   | Vasantha  | Kumar    | Chennai         | 4523632684574374 | Master Card      | June     |    2022 | 964 |

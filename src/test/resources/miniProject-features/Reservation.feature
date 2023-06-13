Feature: confirm reservation functionality

  Scenario Outline: verify user able to reserve
    Given user navigates to reservation page  "https://blazedemo.com/purchase.php"
    When user enters Full name "<First Last>"
    And user enters adress "<Address>"
    And user enters city "<City>"
    And user enters state "<State>"
    And user enters zipcode "<Zipcode>"
    And user selects credit card type"<Card Type>"
    And user enters credit card number"<Credit Card Number>"
    And user enters month "<Month>"
    And user enters year "<Year>"
    And user enters name on card "<Name on Card>"
    And user clicks "<Remember Me>"
    And user clicks "<Purchase Flight>"
    Then User verifies success message "<Message>"

    Examples: 
      | First Last     | Address | City     | State | Zipcode | Card Type        | Credit Card Number | Month | Year | Name on Card | Message               |
      | John Cina      | 123 St  | Astoria  | NY    |   34567 | Visa             |     09876543210987 |    12 |   27 | John         | Successfully Reserved |
      | Johnny Depp    | 657 St  | Linden   | NJ    |   87654 | American Express |     87656789876543 |    11 |   26 | Johnny       | Successfully Reserved |
      | Johnn Travolta | 321 St  | Somerset | NJ    |   65723 | Diner's Club     |     40980968723541 |    10 |   27 | Johnn        | Successfully Reserved |
      | Tom Cruse      | 987 St  | Stamford | CT    |   90879 | American Express |     09874870923541 |    04 |   25 | Tom          | Successfully Reserved |
      | Will Smith     | 0098 St | Austin   | Tx    |   27409 | Visa             |     07698549789724 |    06 |   29 | Will         | Successfully Reserved |

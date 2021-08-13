Feature:Workflow of buying a product online


  Scenario :Selection the product  and navigate to product page
    When customer  on the main page.
    Then  customer click on the image of T-shirt product titled "name of the t-shirt"
    And  customer click  toaster button to see available products
    Then  customer  navigated to product page

  Scenario :Adding  item by selecting preferred color model and size
    When customer is on product page
    Then customer selects on preferred “color”
    And customer clicks on Model dropdown menu
    Then customer selects the name of product as “Men's T-shirt, closed V-neck”
    And customer clicks the “size” of product

  Scenario  : Compilation of customer information
    When customer enters “email adress” “name” “street” “postal code” and “location”
    Then customer selects the “country name” from dropdown-menu
    Then customer enters “mobile number”


  Scenario: of payment method
    When customer clicks one of the delivery date option
    Then customer clicks payment method
    And customer Verifies the “total payment
    And customer clicks  pay and finish order button

  Scenario: Entering card number details and finalizing shopping
    When customer enters "credit card number", "expiration date"  and "CVC number"
    Then customer clicks button finalize shopping

  Scenario Outline: Entering card nubmer details of many customers
    When customer enters "<credit card number>", "<expiration date>"  and  "<CVC number>"
    Then customer clicks button finalize shopping

    Examples:
      | credit card number | expiration date | CVC number |
      | 43464653536536     | 10/2025         | 534        |
      | 35646353533        | 11/2023         | 546        |

  Scenario Outline:Compilation of customer information with different data's

    When customer enters “<email address>”, “<name>”, “<street>”, “<postal code>” and “<location>”
    Then customer selects the “country name” from dropdown-menu
    Then customer enters “<mobile number>”
    Examples:
        | email address  | name | street  | postal code | location | mobile number |
        | test1@mail.com | Can  | Serras  | 345364      | Berlin   | 35646363      |
        | test2@mail.com | Tan  | Steetan | 644744      | Madrid   | 35646463      |
        | test3@mail.com | Can  | Serete  | 353646      | Paris    | 33364         |
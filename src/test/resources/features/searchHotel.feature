@functional
Feature:Customers should be able to search hotel names and books


  Background:
    Given  the user is on the  login page
    When  the user enters the "username" and "password"

  @smoke
  Scenario: Search and book a hotel room
    And the user navigates to main page
    Then the customer  enters "hotelname"
    Then the customer select checkin date
    And the customer selects chectout date
    Then the customer clicks select button
    And the customer selects the room and  selectNumberofRoom
    Then the customer clicks booking button




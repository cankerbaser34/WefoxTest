@functional
Feature: Users should be able to login with given credentials

  @smoke
  Scenario: Login as a guest
    Given  the user is on the  login page
    When  the user enters the "username" and "password"
    Then the user should see the welcome text
    And the user should be able to logout by clicking logout button

  @negative_test
  Scenario Outline: Login with different username and passwords

    Given the user is on the  login page
    When the users enters "<username>" "<password>"
    Then the users should get warning message as Invalid Email or Password

    Examples:
      | username           | password |
      |                    |          |
      |                    | etete    |
      | ette               |          |
      | user@phtravels.com | 54664    |






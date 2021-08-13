Feature: Give order domino

  Background:
    Given customer is on main page

  @smoke
  Scenario: Simple domino pizza order
    When customer  click on start order button
    Then select "provience name"
    And select "location"
    And enter street name
    Then enter "no"
    And click Find store button
    Then click address button
    Then choose type of the "menu"
    And click I want button

  Scenario: Order pizza from create your pizza button
    When customer click on "Create your pizza"
    Then customer can select size of pizza
    And customer selects "sauce option"
    And customer selects "ingredients"
    Then customer clicks  add button
    Then select "provience name"
    And select "location"
    And enter street name
    Then enter "no"
    And click Find store button





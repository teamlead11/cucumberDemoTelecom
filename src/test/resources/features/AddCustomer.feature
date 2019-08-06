#Author: greens
@regression @sprint1 @us1234 @xyz @addcust
Feature: To test the add customer functionlaity

  @smoke1
  Scenario: To test the submit button1
    Given The user is in telecom home pag
    And The user navigates to add customer page
    When The user fill in the form details
      | AddCustomer | phNum |
      |           2 |     4 |
    And The user submits the form
    Then The customer should see the customer id generated.

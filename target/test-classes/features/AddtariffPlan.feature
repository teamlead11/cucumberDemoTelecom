#Author: your.email@your.domain.com
@regression
Feature: To test add tariff plan functionality

  @sprint2
  Scenario Outline: Add Traffi details and get message
    Given The user is in add tariff plan page
    When The user fill in the tariff plan details "<PlanDetails>"
    And Click the sumit button
    Then The user should see the success message

    Examples: 
      | PlanDetails |
      |           5 |
   

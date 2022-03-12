#Autor: Tania Ruiz Sanchez
@stories
  Feature: financialUtest
    As a user, I want to fill out the form on the uTest page to create
  @scenario1
  Scenario: Load uTest main page
    Given I want to create a user and load the main page uTest
    When I look for the Join Today button
    Then I find the page to fill out the user creation form
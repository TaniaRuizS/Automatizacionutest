#Autor: Tania Ruiz Sanchez
@stories
  Feature: financialUtest
    As a user I want to fill in data on the Utest page to create a user
  @scenario1
  Scenario: create user on Utest page
    Given tania wants to create a user on the Utest page
    When she looks for the JoinToday button and completes the data
    # Then she accesses the page and creates the user correctly
    Then she accesses the page and displays the message Welcome
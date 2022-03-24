#Autor: Tania Ruiz Sanchez
@stories
  Feature: financialUtest
    As a user I want to fill in data on the Utest page to create a user

    @scenario1
    Scenario Outline: create user on Utest page
      Given tania wants to create a user on the Utest page
      When she looks for the JoinToday button and completes the data
        | firstname   | lastname   | email   | month   | day   | year   | city   | postalcode   | password1   | password2   |
        | <firstname> | <lastname> | <email> | <month> | <day> | <year> | <city> | <postalcode> | <password1> | <password2> |

      Then she accesses the page and displays the message Welcome

      Examples:
        | firstname | lastname | email                      | month | day | year | city    | postalcode | password1        | password2        |
        | Tania     | Ruiz     | dinotania123@hotmail.com   | March | 23  | 1995 | Pereira | 66001      | Taniasanchez123* | Taniasanchez123* |
        | Santiago  | Sanchez  | dinotania12345@hotmail.com | July  | 25  | 1998 | Pereira | 66001      | Dinosanchez123*  | Dinosanchez123*  |

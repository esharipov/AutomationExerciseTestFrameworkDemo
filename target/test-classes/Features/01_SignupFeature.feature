#Author: emil.sharipov@hotmail.com
Feature: Signup Functionality

  Background: 
    Given user is on the main page
    When user navigates to login and signup page

  Scenario Outline: Validate that user can sign up for a new account
    Given user enters "<firstName>" and "<emailAddress>"
    And user clicks signup
    And user populates All Information on the next page
    And user clicks create account
    Then user is registered

    Examples: 
      | firstName | emailAddress              |
      | Emil      | emil.sharipov@hotmail.com |

  Scenario: Validate that upon clicking sign up button without entering email address and name, an error message is displayed
    Given user clicks signup
    Then user cannot proceed to registration form

  Scenario Outline: Validate that upon attempting to sign up for an account using an email that is already registered, an error message is displayed
    Given user enters "<firstName>" and "<emailAddress>"
    And user clicks signup
    Then user cannot proceed to registration form

    Examples: 
      | firstName | emailAddress              |
      | Emil      | emil.sharipov@hotmail.com |

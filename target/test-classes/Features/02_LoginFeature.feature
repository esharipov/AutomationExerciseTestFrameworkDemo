Feature: Login Functionality

  Background: 
    Given user is on the main page
    When user navigates to login and signup page

  Scenario: Validate that login functionality is successful with correct credentials
    When user enters username "emil.sharipov@hotmail.com" and password "password123"
    And user clicks on login button
    Then user is logged in

  Scenario: Validate that upon entering incorrect credentials, user cannot login
    When user enters username "emil.sharipov@hotmail.com" and password "wrongpassword"
    And user clicks on login button
    Then user is unable to login

  Scenario: Validate that upon clicking login button without entering credentials, user is unable to login
    When user does not enter credentials
    And user clicks on login button
    Then user is unable to login

  Scenario: Validate that user is able to log out from account upon clicking logout button
    When user enters username "emil.sharipov@hotmail.com" and password "password123"
    And user clicks on login button
    And user clicks on logout button
    Then user is logged out

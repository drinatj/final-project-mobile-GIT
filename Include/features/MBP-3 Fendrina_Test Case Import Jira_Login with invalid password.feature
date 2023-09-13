@Login

Feature: Login Feature

As a user, I want to login with invalid password to Bank App Demo so that I can get the error message.

@Valid

Scenario: Login with valid password

Given I navigate to Bank App Demo loginpage
When I enter valid username
And I enter valid password
And I click on the login button
Then I should be able to login successfully

@InValid

Scenario: Login with invalid password

Given I navigate to Bank App Demo loginpage
When I enter valid username
And I enter invalid password
And I click on the login button
Then I should see an error message

Scenario: Login with empty password

Given I navigate to Bank App Demo loginpage
When I enter valid username
And I leave the password field empty
And I click on the login button
Then I should see an error message

Scenario: Login with incorrect username

Given I navigate to Bank App Demo loginpage
When I enter incorrect username
And I enter valid password
And I click on the login button
Then I should see an error message

Examples:
| username | password |
| lisagomez | notadmin |
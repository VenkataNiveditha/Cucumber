Feature: Validation of login functionality

Scenario: Login functionality validation
When I login into stockAccounting Url on Chrome Browser
When I click reset button on Login Page
And I enter admin in UserName Field
And I enter master in Password Field
When I click login Button
When I wait for Logout Link 
Then I validate the title of the Home page and close the Browser                                                                                                                                                                                                                                                                                                                                                                                                    
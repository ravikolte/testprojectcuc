#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)

#Sample Feature Definition Template
@tag
Feature: Change the password of the account

@tag1
Scenario Outline: Change the password of my account
Given That I am homepage then click on Change Password
Then I Enter details to change password "<OldPassword>" "<NewPassword>" "<ConfirmPassword>"
Then I Click on Submit button on change password form

Examples:
    | OldPassword| NewPassword  | ConfirmPassword       |
    | 38202      |  1000        | Withdrew thousand     |
    | 38202      |  2000        | Withdrew two thousand |

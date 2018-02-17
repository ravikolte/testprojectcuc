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
Feature: Create a New Account for the customer

@tag2
Scenario Outline: Create new account
Given I am on homepage and click on New Account
Then I Enter Customer Id "<customerid>"
Then I select Account type "<accountype>"
And Enter the Initial deposit amount "<initialdeposit>"
Then I click on Submit button on New Account form

Examples:
    | customerid  |accountype | initialdeposit |
    | 38939       |  Savings  | 50000          |
    | 38939       |  Savings  | 200000         |

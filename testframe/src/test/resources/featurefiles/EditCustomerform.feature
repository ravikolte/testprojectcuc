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
Feature: Edit customer details

@tag1
Scenario Outline: Edit customer

Given I am at login page
	And Enter UserId
	And Enter Password
Then Click on Login
And Click on EditCustomer
Then Enter "<CustomerID>"
Then Click on Submit button on edit page

Examples:
|CustomerID|Email|
|37030     |testmefirst@testit.com|

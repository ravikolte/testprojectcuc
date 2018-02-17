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
Feature: Delete Customer using Customer id of the customer

@tag2
Scenario Outline: Delete Customer
Given That I am homepage then click on Delete Customer Form
Then I Enter the "<CustomerID>" of the customer that needs to be deleted
Then I Click on Submit button on Delete Customer form


Examples:
    | CustomerID  |
    | 37030       | 
    | 37030       |  

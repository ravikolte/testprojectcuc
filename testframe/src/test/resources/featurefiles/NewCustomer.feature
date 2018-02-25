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
Feature: Create New Customer 

Scenario Outline: Add new customer
And Click on NewCustomer
Then I enter "<CustomerName>" "<Gender>" "<DOB>" "<Address>" "<City>" "<State>" "<PIN>" "<MobileNumber>" "<Email>" and "<Password>"
Then Click on Submit button

Examples:
|CustomerName|Gender| DOB     |Address  |City|State      |PIN   |MobileNumber|Email        |Password|
|vgky Kolte  | Male |06081989 |Magarpatta|Pune|Maharashtra|411013|1234567890  |teskt165456@test.com|test123 |


Scenario Outline: Customer Name Text field validation
And Click on NewCustomer
Then I enter "<CustomerName>" and match actual result with the "<ExpectedResult>"

Examples:
|CustomerName|ExpectedResult          |
| |First character can not have space |
|10|Numbers are not allowed|
|$|Special characters are not allowed|


Scenario: Verify that the Male radio button is selected by default
And Click on NewCustomer
Then Verify that male option is selected by default


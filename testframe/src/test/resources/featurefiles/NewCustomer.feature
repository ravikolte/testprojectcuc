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

Feature: Create New Customer 


Scenario Outline: Add new customer
And Click on NewCustomer
Then I enter "<CustomerName>" "<Gender>" "<DOB>" "<Address>" "<City>" "<State>" "<PIN>" "<MobileNumber>" "<Email>" and "<Password>"
Then Click on Submit button

Examples:
|CustomerName|Gender| DOB     |Address  |City|State      |PIN   |MobileNumber|Email        |Password|
|R Kolte  | Male |06081989 |Magarpatta|Pune|Maharashtra|411013|1234567890  |rg@test.com|test1623 |

@SmokeTest
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

Scenario Outline: Address text area field validation
And Click on NewCustomer
Then Verify that Address text area "<Address>" and match actual result with the "<ExpectedResult>"

Examples:
|Address|ExpectedResult          |
| |First character can not have space |
|$|Special characters are not allowed|

@SmokeTest
Scenario Outline: City field validation
And Click on NewCustomer
Then Verify that City field "<City>" and match actual result with the "<ExpectedResult>"

Examples:
|City|ExpectedResult          |
| |First character can not have space |
|10|Numbers are not allowed|
|$|Special characters are not allowed|

Scenario Outline: State field validation
And Click on NewCustomer
Then Verify that State field "<State>" and match actual result with the "<ExpectedResult>"

Examples:
|State|ExpectedResult          |
| |First character can not have space |
|10|Numbers are not allowed|
|$|Special characters are not allowed|

Scenario Outline: PIN field validation
And Click on NewCustomer
Then Verify that PIN field "<PIN>" and match actual result with the "<ExpectedResult>"

Examples:
|PIN|ExpectedResult          |
| |First character can not have space |
|wed|Characters are not allowed|
|$|Special characters are not allowed|
|12345|PIN Code must have 6 Digits|

Scenario Outline: Mobilenumber field validation
And Click on NewCustomer
Then Verify that Mobilenumber field "<Mobilenumber>" and match actual result with the "<ExpectedResult>"

Examples:
|Mobilenumber|ExpectedResult          |
| |First character can not have space |
|wed|Characters are not allowed|
|$|Special characters are not allowed|

#Scenario : Check all text fields on New customer page should not be left blank
# And click on NewCustomer
# Press space key and then backspace for all the text fields
# Verify that the appropriate message is displayed

#Scenario : Email address validation
# And click on NewCustomer
# Verify that the email id not valid is displayed until a valid email address is entered

#Scenario : Reset button
# And click on NewCustomer
# Enter data in all the fields
# Click on Reset button
# Verify that all the data from the fields are cleared








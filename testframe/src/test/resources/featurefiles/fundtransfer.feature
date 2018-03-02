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
Feature: Fund transfer


@tag2
Scenario Outline: Fund transfer to another account
Given That I am homepage then click on Fund transfer page
Then I Enter Payers Account No "<payersaccountno>" 
Then I Enter Payees Account No "<payeesaccountno>"
And Enter Amount "<Amount>"
Then I Add the Description "<Description>"
Then I will click on Submit button to transfer fund

Examples:
    | payersaccountno  |payeesaccountno |Amount|Description|
    | name1            |  5             | 100  |t          |
    | name2            |  7             | 200  |w          |
    
    
Scenario Outline: Payers Account No field validation
Given That I am homepage then click on Fund transfer page 
Then Verify that Payers Account No "<payersaccountno>" and match actual result with the "<ExpectedResult>"

Examples:
|payersaccountno|ExpectedResult          |
| |First character can not have space |
|$|Special characters are not allowed|
|ad|Characters are not allowed|

Scenario Outline: Payees Account No field validation
Given That I am homepage then click on Fund transfer page
Then Verify that Payees Account No "<payeesaccountno>" and match actual result with the "<ExpectedResult>"

Examples:
|payeesaccountno|ExpectedResult          |
| |First character can not have space |
|$|Special characters are not allowed|
|ad|Characters are not allowed|




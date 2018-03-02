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
Feature: Withdraw Amount from Bank Account

#Background: Verify the Login Section
#Given I am at login page
#	And Enter UserId
	#And Enter Password
#Then Click on Login

@tag2
Scenario Outline: Withdraw Amount into an Account
Given That I am homepage then click on Withdrawal
Then I Enter withdrawal details "<AccountNo>" "<Amount>" "<Description>"
Then I Click on Submit button on Withdrawal form

Examples:
    | AccountNo| Amount  | Description           |
    | 38202    |  1000   | Withdrew thousand     |
    | 38202    |  2000   | Withdrew two thousand |
    

Scenario Outline: Account No field validation
Given That I am homepage then click on Withdrawal 
Then Verify that Account No "<accountno>" and match actual result with the "<ExpectedResult>"

Examples:
|accountno|ExpectedResult          |
| |First character can not have space |
|$|Special characters are not allowed|
|ad|Characters are not allowed|

Scenario Outline: Amount field validation
Given That I am homepage then click on Withdrawal 
Then Verify that Amount "<amount>" and match actual result with the "<ExpectedResult>"

Examples:
|amount|ExpectedResult          |
| |First character can not have space |
|$|Special characters are not allowed|
|ad|Characters are not allowed|





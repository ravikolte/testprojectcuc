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
#@ (Tags/Labels):To group Scenarios Description
#<> (placeholder)
#""
## (Comments)

#Sample Feature Definition Template
@tag


Feature: Amount will be deposited for the existing customer

#Background: Verify the Login Section
#Given I am at login page
#	And Enter UserId
	#And Enter Password
#Then Click on Login

@tag2
Scenario Outline: Deposit Amount into an Account
Given That I am homepage then click on Deposit
Then I Enter "<AccountNo>" "<Amount>" "<Description>"
Then I Click on Sumbit button

Examples:
    | AccountNo| Amount  | Description           |
    | 38202    |  1000   | Deposited thousand    |
    | 38202    |  2000   | Deposited two thousand|

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
Feature: To get Customized Statement 

@tag1
Scenario Outline: Get Customized Statement
Given That I am homepage then click on Customised Statement
Then I Enter details to change password "<AccountNo>" "<Fromdate>" "<ToDate>" "<MinimumTransactionvalue>" "<NumberofTransactions>"
Then I Click on Submit button on Customized Statemen form

Examples:
    | AccountNo| Fromdate  | ToDate   |MinimumTransactionvalue|NumberofTransactions|
    | 38202    |  01012018 | 01012018 |   1000                |  2                 |
    | 38202    |  01012018 | 01012018 |   2000                |  3                 |

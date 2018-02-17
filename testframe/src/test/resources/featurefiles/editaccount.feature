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
Feature: Edit Account 


@tag2
Scenario Outline: Edit account
Given that I am on homepage and click on Edit Account
Then I Enter the Account No "<accountno>"
Then I Click on Submit button
When I am on the Edit Acount Entry form and change the type of account "<accounttype>"
And Click on Submit button 

Examples:
    | accountno  |accounttype | 
    | 38939      |  Cuurent   | 
    | name2 |  7   | Fail   |

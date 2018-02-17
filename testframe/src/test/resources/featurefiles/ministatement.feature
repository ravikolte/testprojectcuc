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
Feature: Mini Statement 

@tag1
Scenario Outline: Get mini statement
Given That I am at homepage then click on Mini Statement
Then I Enter Account number "<AccountNo>"
Then I Click on Submit button on Mini Statement form

Examples:
    | AccountNo  |
    | 38425      |  
    | 38425      | 

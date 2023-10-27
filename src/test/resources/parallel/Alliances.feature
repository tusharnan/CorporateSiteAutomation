Feature: Careers feature 

Background:
Given user is on Landing page
And user accept cookies
And user clicks on burger Menu
And user clicks on Coe
And user clicks on alliances

Scenario: Alliances overview page title
When user clicks on Alliances overview 
Then page title should be "The Alliance Ecosystem" for alliances section

#Scenario: Alliances salesforce page title
#When user clicks on Alliances salesforce  
#Then page title should be "Salesforce CRM Consulting & Implementation Partner" for alliances section
#
#Scenario: Alliances servicenow page title
#When user clicks on Alliances serviceNow  
#Then page title should be "ServiceNow Partner - Consulting and Implementation | Cybage" for alliances section
#
#Scenario: Alliances aws page title
#When user clicks on Alliances Aws  
#Then page title should be "AWS Consulting Services & Cloud Solutions | Cybage" for alliances section
#
#Scenario: Alliances salesforce page title
#When user clicks on Alliances Korber  
#Then page title should be "Körber Supply Chain Management Software" for alliances section
#
#

Feature: Testing and Qa feature 

Background:
Given user is on Landing page
And user accept cookies
And user clicks on burger Menu
And user clicks on Coe
And user clicks on Testing and Qa

Scenario: Testing and Qa overview page title
When user clicks on Testing and QA overview 
Then page title should be "Software Testing Services and Consulting - QA Outsourcing | Cybage" for Testing and Qa section

Scenario: Test Architectural consultancy page title
When user clicks on Test Architectural consultancy   
Then page title should be "Software Testing Architectural Consultancy Services | Cybage" for Testing and Qa section

Scenario: Agile Automation testing page title
When user clicks on  Agile automation Testing  
Then page title should be "Software Automation Testing Services and Solutions | Cybage" for Testing and Qa section

Scenario: Testing in connectected world page title
When user clicks on Testing in connected world  
Then page title should be "Mobile App Testing Services - Compatibility Testing | Cybage" for Testing and Qa section

Scenario: Performnce testing  page title
When user clicks on performance Testing  
Then page title should be "Software Performance Testing Services and Solutions | Cybage" for Testing and Qa section



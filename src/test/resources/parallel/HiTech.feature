Feature: HiTech Page 

Background:
Given user is on Landing page
And user accept cookies
And user clicks on burger Menu
And user clicks on industry section to click on Hitech
And user clicks on hitech vertical
And user clicks on overview under hitech vertical

Scenario: Hitech page title
Then title of the page needs to be "Hi-Tech Product & Platform Engineering Services" for hitech page

Scenario: check automotive retail under Hitech vertical
And user clicks on automotive retail card 
Then user should be redirected to "Automotive Retail"

Scenario: check human resource management system card under Hitech vertical
And user clicks on  card Human resource management
Then user should be redirected to "Human Resource Management Systems (HRMS) Solutions | Cybage"

Scenario: check customer experiace and market research card under Hitech vertical
And user clicks on customer experiace and market research card
Then user should be redirected to "Customer Experience & Market Research"

Scenario: check enterprise workflow engine card under hitech vertical
And user clicks on enterprise workflow engine card
Then user should be redirected to "Enterprise Workflow Solutions & Rules Engines"

Scenario: check Social & Collaboration Platform card under hitech vertical
And user clicks on Social & Collaboration Platform card
Then user should be redirected to "Social & Collaboration Platform"


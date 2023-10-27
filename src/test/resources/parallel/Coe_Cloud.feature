Feature: Cloud Services pages

Background:
Given user is on Landing page
And user accept cookies
And user clicks on burger Menu inside header section
And user clicks on Coe
Given user clicks on Cloud

#Scenario: Cloud overview page title
#When user clicks on overview under cloud section
#Then page title should be "Cloud Computing Solutions & Implementation Services | Cybage" under cloud vertical

#Scenario: Cloud Testing services page title
#When user clicks on Cloud Testing services under cloud section
#Then page title should be "Cloud Testing Services and Solutions | Cybage" under cloud vertical

#Scenario: Consultancy services page title
#When user clicks on consultancy services under cloud section
#Then page title should be "Cloud Consulting Services & Strategy Roadmap | Cybage" under cloud vertical

#Scenario: CloudNative services page title
#When user clicks on Cloud Native under cloud section
#Then page title should be "Cloud Native Development & Technology Services | Cybage" under cloud vertical

#Scenario: Cloud Migration services page title
#When user clicks on Cloud Migration under cloud section
#Then page title should be "Cloud Migration Strategy and Services | Cybage" under cloud vertical

#Scenario: Devops services page title
#When user clicks on Devops under cloud section
#Then page title should be "DevOps Implementation Solutions & Consulting Services | Cybage" under cloud vertical

Scenario: Cloud TechOps services page title
When user clicks on Cloud TechOps under cloud section
Then page title should be "Cloud Operations Services & TechOps Solutions| Cybage" under cloud vertical


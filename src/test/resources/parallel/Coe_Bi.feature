Feature: Bi pages under Coe Vertical

Background:
Given user is on Landing page
And user accept cookies
And user clicks on burger Menu inside header section
And user clicks on Coe
Given user clicks on Bussiness Intelegence

Scenario: Bussiness intellegnce overview page title
When user clicks on overview under Bi section
Then title of the page should be "Business Intelligence Services - Cybage" under Bi section


Scenario: BI DW Consultation page title
When user clicks on Bi DW Consultation page
Then title of the page should be "Data Warehousing and Business Intelligence - Cybage" under Bi section

Scenario: BI Reporting and Analytics page title
When user clicks on BI Reporting and Analytics
Then title of the page should be "Mobile App Design, Development & Maintenance Services | Cybage" under Bi section

Scenario: Data Integration page title
When user clicks on BI Reporting and Analytics
Then title of the page should be "Data Integration - Cybage" under Bi section

Scenario: Innovation Engineering page title
When user clicks on Innovation Engineering
Then title of the page should be "Innovation Engineering - Cybage" under Bi section





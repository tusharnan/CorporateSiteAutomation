Feature: Cloud Services pages

Background:
Given user is on Landing page
And user accept cookies
And user clicks on burger Menu inside header section
And user clicks on Coe
Given user clicks on Enterprise Mobility

Scenario: Enterprise mobility page title
When user clicks on overview under Enterprise mobility
Then title of the page should be "Enterprise Mobility Management Solutions & Services | Cybage"


Scenario: Application innovation nad consulting page title
When user clicks on Application innovation and consulting under Enterprise mobility
Then title of the page should be "Mobile Application Innovation and Consulting Services | Cybage"

Scenario: Mobile application Developement and Maintainance page title
When user clicks on Mobile application Developement and Maintainance under Enterprise mobility
Then title of the page should be "Mobile App Design, Development & Maintenance Services | Cybage"

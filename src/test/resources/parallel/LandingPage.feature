Feature: Landing page feature

Background:
Given user is on Landing page
And user accept cookies


Scenario: Landing page title
When user gets the title of the page for landing
Then page title should be "IT Services - Technology & Digital Transformation Consulting | Cybage | Cybage Software Pvt Ltd"

Scenario: logo click on header
When user clicks on logo in header
Then it should redirect to home page

Scenario: click on career in header
When user clicks on career in header
Then user should be redirected to "Careers" page

#Scenario: subscribe functionality 
#When i scroll down to subscribe section 
#And enter my email "randomguy"
#And click on subscribe button
#Then i should be redirected thank you page


Scenario: Subscribe functionality with valid credentials
When i scroll down to subscribe section 
And enter my valid email "tushar@cybage.com"
And click on subscribe button
Then i should get validation msg 

Scenario Outline: Social media icons working check
When i scroll down to subscribe section 
And i click on following <social_media_icon> 
Then i should be redirected to social media platform


Examples:
|social_media_icon |
|"LinkedIn" |
|"Twitter" |
|"facebook" |




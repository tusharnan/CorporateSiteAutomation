Feature: Contact us page functionality

Background: 
Given user is on contact us page

Scenario: contact us form filling
When user fills the form 
And accept privacy policy 
And subscribe to email 
And click login button
Then user should get success msg

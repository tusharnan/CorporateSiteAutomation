Feature: Company feature 

Background:
Given user is on Landing page
And user accept cookies
And user clicks on burger Menu
And user clicks on Company

Scenario: About us page
When user clicks on about us 
Then user should land on about us page

Scenario: Awards page
When user clicks on Awards 
Then user should land on "Awards Recognitions"

Scenario: Leadership page
When user clicks on Leadership 
Then user should land on "Leadership"

Scenario: Responsible business page
When user clicks on Responsible business
Then user should land on "Responsible Business"

Scenario: Ceos Desk page
When user clicks on Ceos Desk
Then user should land on "CEO's Desk"

Scenario: Corporate Governance page
When user clicks on corporate governance
Then user should land on "Corporate Governance"




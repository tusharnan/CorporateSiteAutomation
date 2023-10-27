Feature: Newsroom feature 

Background:
Given user is on Landing page
And user accept cookies
And user clicks on burger Menu

Scenario: Press release page
And user clicks on Newsroom
Then page title should be "Press Release | Cybage Software Pvt Ltd" under newsroom vertical



Feature: Testing and Qa feature 

Background:
Given user is on Landing page
And user accept cookies
And user clicks on burger Menu
And user clicks on Coe
And user clicks on Support Services

Scenario: Support Services  overview page title
When user clicks on Support Service overview 
Then page title should be "Support Services – 24x7 Business Continuity | Cybage" for Support Service section

Scenario: RIM testing page title
When user clicks on  RIM Testing  
Then page title should be "Remote Infrastructure Management (RIM) Services" for Support Service section

Scenario: Technical support page title
When user clicks on Technical support  
Then page title should be "Technical Support Services for Software & Application | Cybage" for Support Service section

Scenario: ITeS and Bpo page title
Given user scroll down
When user clicks on ITeS and BPO Testing  
Then page title should be "ITeS & BPO Services Partner | Cybage" for Support Service section



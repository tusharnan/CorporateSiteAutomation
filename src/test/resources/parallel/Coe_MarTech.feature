Feature: Cloud Services pages

Background:
Given user is on Landing page
And user accept cookies
And user clicks on burger Menu inside header section
And user clicks on Coe
Given user clicks on Martech

Scenario: MarTech overview page title
When user clicks on overview under MarTech section
Then page title should be "MarTech Consulting Services - Marketing Technology Solutions | Cybage" under MarTech vertical

Scenario: MarTech Elevate your customer Experiance title
When user clicks on Elevate your customer Experiance
Then page title should be "Elevate Customer Experience - SCORE Framework" under MarTech vertical

Scenario: Experiance design page title
When user clicks on Experiance design 
Then page title should be "Creative Production Services - Visual Design Solutions | Cybage" under MarTech vertical

Scenario: Digital Marketing Strategy page title
When user clicks on  Digital Marketing 
Then page title should be "Digital Marketing Strategy and Consulting Services | Cybage" under MarTech vertical

Scenario: Content production page title
When user clicks on Content production 
Then page title should be "Content Production Services and Solutions | Cybage" under MarTech vertical

Scenario:  Marketing Transformation Strategy page title
When user clicks on Marketing  Transformation 
Then page title should be "Marketing Transformation Consulting Services & Solutions | Cybage" under MarTech vertical









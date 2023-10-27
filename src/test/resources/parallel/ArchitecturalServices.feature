Feature: Architectural  Services pages

Background:
Given user is on Landing page
And user accept cookies
And user clicks on burger Menu inside header section
And user clicks on Coe
Given user clicks on Architecural services

Scenario: Architecural services overview page title
Given user clicks on overview under Architectural services section
Then user should land on "Application Architecture Consulting Services - Cybage" inside Architectural services 

Scenario: System Architecture page title under Architectural services vertical
Given user clicks on System Architecture under Architectural services section
Then user should land on "System Architecture Consulting Services & Solutions | Cybage" inside Architectural services 

Scenario: Technology roadmap page title under Architectural services vertical
Given user clicks on Technology roadmap under Architectural services section
Then user should land on "Technology Roadmap Consulting & Services | Cybage" inside Architectural services 

Scenario: NFR Consulting page title under Architectural services vertical
Given user clicks on NFR Consulting under Architectural services section
Then user should land on "NFR Consulting Services - Software Performance & Scalability | Cybage" inside Architectural services 

Scenario: Architectural Evalutation page title under Architectural services vertical
Given user clicks on Architectural Evaluation under Architectural services section
Then user should land on "Software Architecture Evaluation Services" inside Architectural services 




Feature: Travel and Hospitality 
Background:
Given user is on Landing page
And user accept cookies
And user clicks on burger Menu
And user clicks on industry section to click on TravelAndHospitality
And user clicks on Travel and Hospitality
And user clicks on overview under Travel and Hospitality vertical

Scenario: Check Travel and Hospitality overview page title
Then user should be redirected to "Travel and Hospitality- IT Consulting and Technology Solutions | Cybage" of travel and hospitality section

Scenario: check Travel and hospitality subpages titles one by one
And user click on Hospitality card
Then page title should be "Hospitality Technology Solutions & IT Services| Cybage" for travel and hospitality subpages

Scenario: check distrbution subpage title
And user click on Hospitality card
And user clicks on distribution in menulist
Then page title should be "Travel Distribution IT Solutions & Services | Cybage" for travel and hospitality subpages

Scenario: check car rental subpage title
And user click on Hospitality card
And user clicks on car rental in menulist
Then page title should be "Car Rental Technology & IT Solutions | Cybage" for travel and hospitality subpages

Scenario: check events and meeting subpage title
And user click on Hospitality card
And user clicks on Events and meetings in menulist
Then page title should be "Digital Events & Meetings Management Technology Solutions | Cybage" for travel and hospitality subpages

Scenario: check airline subpage title
And user click on Hospitality card
And user clicks on Airlines in menulist
Then page title should be "Airline Industry IT Services & Technology Solutions | Cybage" for travel and hospitality subpages



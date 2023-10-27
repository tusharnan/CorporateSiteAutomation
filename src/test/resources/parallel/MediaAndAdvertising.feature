Feature: Median and advertising page 

Background:
Given user is on Landing page
And user accept cookies
And user clicks on burger Menu
And user clicks on industry section
And user clicks on Media and Advertising vertical 

Scenario: Media and advertising page title
And user clicks on overview under media and advertising section
Then title of the page needs to be "Media and Advertising"

Scenario: AdTech subverical page 
And user clicks on Ad Tech subvertical under MandA page
Then title of the page needs to be "AdTech Solutions Ad Technology - Consulting Services | Cybage"

Scenario: Advertising and Marketing page
And user clicks on advertising and marketing page
Then title of the page needs to be "Digital Advertising and Marketing Consulting Services | Cybage"

Scenario: publishing subvertical page
And user clicks on publishing subverical page
Then title of the page needs to be "Marketing & Advertising Solutions for Publishing Companies | Cybage"

Scenario: video Streaming and ott subvertical page
And user clicks on video Streaming and ott  subverical page
Then title of the page needs to be "Interactive Advertising Solutions - Video Streaming & OTT | Cybage"

Scenario: entertainment production subvertical page
And user clicks on entertainment production subverical page
Then title of the page needs to be "Entertainment Production IT Solutions | Cybage"

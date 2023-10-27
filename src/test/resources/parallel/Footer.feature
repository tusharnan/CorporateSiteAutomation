Feature: Footer functionality

Background:
Given user is on Landing page
And user accept cookies
And user scroll to footer


Scenario Outline: Links Validation in footer
When user clicks on <linktag> in footer
Then user should redirected to <pageTitle> in footer



Examples:
|linktag | pageTitle |
|"Awards" | "Awards Recognitions"|
|"Leadership" | "Leadership" |
|"CeoDesk" |"CEO's Desk"|
|"Corporate Governance" |"Corporate Governance" |
|"Media & Advertising" |  "Media and Advertising"|
|"Hi-Tech" | "Hi-Tech Product & Platform Engineering Services"|








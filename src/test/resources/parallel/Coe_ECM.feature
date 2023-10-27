Feature: Cloud Services pages

Background:
Given user is on Landing page
And user accept cookies
And user clicks on burger Menu inside header section
And user clicks on Coe
Given user clicks on Ecm


#Scenario: Ecm overview page
#When user clicks on Ecm overview 
#Then page title should be "Digital Experience Platform (DXP) Services & Solutions | Cybage" for Ecm vertical


Scenario: Ecm Aem page
When user clicks on AEM 
Then page title should be "AEM Consulting Services - Adobe Experience Cloud Solutions | Cybage" for Ecm vertical

Scenario: Ecm Drupal page title
When user clicks on Drupal 
Then page title should be "Drupal Web Development Consulting Services | Cybage" for Ecm vertical

Scenario: Ecm sharepoint page title
When user clicks on sharepoint 
Then page title should be "SharePoint Consulting and Migration Services | Cybage" for Ecm vertical

Scenario: Ecm sitecore page title
When user clicks on sitecore 
Then page title should be "Sitecore Consulting and Integration Solutions | Cybage" for Ecm vertical

Scenario: Ecm sitefinity page title
When user clicks on sitefinity 
Then page title should be "Custom Sitefinity Development Services and Consulting | Cybage" for Ecm vertical



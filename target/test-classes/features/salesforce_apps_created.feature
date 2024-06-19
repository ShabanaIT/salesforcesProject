Feature: Salesforce app created 

Scenario Outline: sales force app create functionalities
Given I am in salesforce Landing page
When  I hover on login menu
Then  I click on salesforce
Then  I am taking data from Excel <RowNumber>
Then  Enter User Id as         
And   I Enter Password as 
Then  I click on login button
Then  I click on Apps
And   I click on AppManager
Then  I click on New Lightening App
Then  I enter AppName 
And   I enter DevoloperName
And   I enter Description 
And   I upload image
Then  I click next 
Then  I click next 
Then  I click next 
Then  I click next 
Then  I click on save&finish
Then  I click on AppName nursery world dropdown
And   I click on edit
And   I updated description
And   I click on save button
Then  I click to go back
Then  I click on Apps
And   I click on AppManager
Then  I click on AppName nursery world dropdown
And   I click on delete button
Then  I click on delete
Then  I click on view profile
And   I click on log out button

Examples:
     |RowNumber|
     |   0     |

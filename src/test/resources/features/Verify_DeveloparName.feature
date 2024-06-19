Feature: sales force deleteMobileApp  functionalities

Scenario Outline: Verify delete MobileApp Pop-up window functionalities
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
Then  I click on saveAndfinish
Then  I click on AppName nursery world dropdown
And   I click on delete button
Then  Verify delete MobileApp Pop-up window
Examples:
     |RowNumber|
     |   0     |










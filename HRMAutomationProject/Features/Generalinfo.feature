Feature: Edit General Information of employees at Orange HRM 

@chrome 
Scenario: Want to edit/change Tax ID General Information in OrangeHRM
Given User logged in to OrangeHRM demo account.
When Clicked on Admin
When Admin MouseHover Admin, click organization, select General Information
And Click on Edit Button 
Then Updated the input of Tax ID to "<654321>" 
Then Clicked Save 
Then Verify if the updated is reflected under General Inforamtion 
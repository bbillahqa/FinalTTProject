Feature: Add new Employement Status on to Orange HRM 

@chrome @AddEmployementStatus
Scenario: Want to add new Employement Status in OrangeHRM 
Given User logged in to OrangeHRM demo account 
When Clicks on Admin
When Admin MouseHover Admin, click job, select Employement Status 
And Click on Add Button 
Then Entered Name "<Freelance>" 
Then Click Save 
Then Verify that Freelance is under Employment Status 


@chrome @DeleteEmployementStatus
Scenario: Want to delete existing Employement Status
Given User logged in to OrangeHRM demo account 
When Clicks on Admin
When Admin MouseHover Admin, click job, select Employement Status
And Select the "Full-Time Permanent" option
And Click on delete button 
Then Verify Full-Time Permanent option has been deleted from Employment Status 
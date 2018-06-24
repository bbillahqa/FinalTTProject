Feature: Add new Nationality on to Orange HRM 

@chrome @AddNationality 
Scenario: Wants to add new Nationality in OrangeHRM under Admin 
	Given User logged in to orangeHRM demo account 
	When Click on Admin 
	When Select Nationalities 
	And Click on add Button 
	Then Enters Name "<Bengali>" 
	Then Clicks Save 
	Then Verify that Bengali is under Nationalities 
	
	
@chrome @DeleteNationality 
Scenario: Wants to delete existing Nationality 
	Given user logged in to OrangeHRM demo account 
	When clicks on Admin 
	When Select Nationality 
	And select the "Bangladeshi" option. 
	And click the delete button 
	Then Verify Bangladeshi option has been deleted from Nationality
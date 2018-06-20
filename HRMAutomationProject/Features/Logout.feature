Feature: Logout from OrgHrm Application
In order to log out from application 
as a Admin
I want to go to welcome Admin,enter LOgout
so that i can logout from the application

#@chrome
Scenario: Admin logout from application
Given Admin in Admin home page
When Admin click on Welcom Admin link
And Click on LOgout link
Then Admin Logout Success full
Then Browser close 


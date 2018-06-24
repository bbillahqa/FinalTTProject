Feature: Logout from OrangeHrm Application
In order to log out from application 
as a Admin
I want to go to welcome Admin,enter LOgout
so that i can logout from the application

@chrome
Scenario: Admin logout from application
Given Admin in Admin home page
And Welcome Admin MouseHover Welcome Admin, click logout
Then Admin Logout Successful
Then Browser close 


Feature:  Add new Job Title to Orange HRM
In Order To add new job title to Orange HRM 
I want to Enter new job title

@chrome
Scenario: Positive- Admin add Job Titel
Given User is already in HRM Admin page 
When User clicks on Admin
And Admin MouseHover Admin, click job, select Jobtitle
And click onAdd Button
And Write jobTitel "Automation Tester"
And Write JobDescription "Test Using Selenium Java"
And click Save
Then Confirmation Message will display
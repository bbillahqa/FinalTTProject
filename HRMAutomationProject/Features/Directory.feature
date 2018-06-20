Feature: Search Employee
In order to Search Employee
I want to go to Search Directory page,Enter employee Name,then Search
So that i can see Existing Employee details

#@chrome @PositiveSearch
Scenario Outline: Positive-Search Valid Employee
Given User is logged in to OrangeHRM demo account
When Click on Directory
And Write Existing EmployeeName"<EmployeeName>"
And Select Job Title
And Click on Search Button
Then I should be able to see the user name with his/her details
Then Close Browser

Examples:
|EmployeeName |
|Sabbir Saymon|

#@chrome @NegativeSearch
Scenario Outline: Positive-Search Valid Employee
Given User is logged in to OrangeHRM demo account
When Click on Directory
And Write Existing EmployeeName"<EmployeeName>"
And Select Job Title
And Click on Search Button
Then No Record found Message Will displayed
Then Close Browser

Examples:
|EmployeeName |
|Iron Man|

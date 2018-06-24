Feature: Add employee
In order to Add a new Employee
as a admin
I want to go to Add employee page,enter FirstName,Lastname,EmployeeId and save
Confirm the new employee has been registered

@chrome @PositiveAddEmployee
Scenario Outline: Positive-Add new Employee
Given  Admin navigate to Admin HomePage
When Admin click on PIM link
And  Admin enter FirstName"<FirstName>"
And Enter LastName"<LastName>"
And Enter EmployeeID"<EmployeeId>
And  click on Save button 
Then Admin will get confirmation
Then Browser Will close
Examples:
|FirstName|LastName|EmployeeId|
|Sabbir   |Saymon  |9090      |

@chrome @NegativeDeleteEmployee
Scenario: Negative-Add new Employee
Given  Admin navigate to Admin HomePage
When Admin click on PIM link
And  Admin enter FirstName "@*@"
And Enter LastName "Saymon"
And Enter EmployeeId "<98765>
And  click on Save button 
Then Print Error Message
Then Browser Will close


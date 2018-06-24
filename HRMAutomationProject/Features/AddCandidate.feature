Feature: Add new Candidates
Wants to add new Candidates that want to apply for open positions
Confirm the new candidates has been added

@chrome @PositiveCandidate
Scenario: Positive-Add new candidates
Given  Navigate to Admin HomePage
When Click on Recruitment link
And Click Add button
And  Enter FirstName "Baki"
And Enter Lastname "Billah"
And Enter EmailId "TalenTech@gmail.com"
And Enter Contact number "3479876543"
And  click the save button 
Then Obtain confirmation
Then Close browser

@chrome @NegativeCandidate
Scenario: Negative-Add new candidates
Given  Navigate to Admin HomePage
When Click on Recruitment link
And Click Add button
And  Enter FirstName "Baki"
And Leave Lastname blank
And Enter EmailId "TalenTech@gmail.com"
And Enter Contact Number "3479876543"
And  click the save button 
Then Confirmation error message
Then Close browser

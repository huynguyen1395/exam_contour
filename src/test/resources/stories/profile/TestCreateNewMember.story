Scenario: Test create new member  
Given the user navigate to tab 'Add Member'
When the user input profile information
When the user agree with terms and conditions
When the user submit information
Then the user get user by id and check information
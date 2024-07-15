
Feature: Orangehrm app test
Scenario: Orangehrm login check
Given url of orangehrm have to be open
And provided username is "Admin"
And provided password is "admin123"
When click login button
Then Home Dashboard should be open

  

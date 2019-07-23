Feature: login fumnctionality
Scenario Outline: login
Given user must be in login page
When user enters <username> and <password>
Then user should be in home page 

Examples:
|username||password|
|"lavanya"||"password"|
|"Lalitha"||"Password123"|
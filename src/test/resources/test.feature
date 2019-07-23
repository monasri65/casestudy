Feature: Register to TestMeApp

Scenario: Registration
Given user must open the TestMeApp in the desired browser
When user fills the username with "ngsriof" , firstname with "mohana" ,lastname with "soundharya" and password with "password" 
And user fills email id with "mohanasoundharya@gmail.com" ,mobile no. with "7810045433" and dob with "10/16/1998"
And user fills address as "harur,dharmapuri" and answer with "moana" 
Then user should be directed to login page


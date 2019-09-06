@UserLogin
Feature: Amazon login feature Test

 Scenario: User able to signin successfully
	Given Launch Browser
	When click on signin button
	And put user name
	And password 
	And click on Submit button
	Then login should be successfull

@SimpleLogin @DataDriven
Feature: To test login in OrangeHRM website

#Here it checks invalid credentials in same feature file	 
@Positive
Scenario: Valid Login OrangeHRM 
	Given user is on login page 
	Then user enters valid "Admin" and "admin123"  
	And click on login button 
	Then user is navigated to home page 

#Here it checks invalid credentials in same feature file	
@Negative	
Scenario: Invalid Login OrangeHRM 
	Given user is on login page 
	Then user enters valid "AdminVj" and "admin" 
	And click on login button 
	Then user is navigated to home page 
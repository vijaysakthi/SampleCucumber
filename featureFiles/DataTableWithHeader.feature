@DataDriven
Feature: Test login OrangeHRM with header
Scenario: Login OrangeHRM 
	Given Enter url and land in login page 
	When Enter correct login details 
		|UserName | Password| 
		|Admin | admin123| 
	And click login button 

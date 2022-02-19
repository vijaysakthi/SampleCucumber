#Here credentials passed as dataTable using | (pipe) symbol
@DataDriven
Feature: Test login in OrangeHRM without header
Scenario: Login in OrangeHRM 
	Given you are on login page 
	When you enter login credentials 
		|Admin | admin123| 
	And you now click the login button 

#Using Examples keyword, use Scenario Outline instead of Scenario
#Use <> brackets for strings 
#Can give multiple credentials for checking login 
@DataDriven
Feature: To login OrangeHRM using Examples
Scenario Outline: Login OrangeHRM site 
	Given proceed to login webpage 
	Then user enters "<UserName>" and "<Password>" 
	And click button to login 
	
	Examples: 
		|UserName | Password| 
		|Admin | admin123|
		|admin|Admin|
		
	
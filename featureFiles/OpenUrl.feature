@SimpleSearch
Feature: This is to test google search 
Scenario: Google search scenario 
	Given user is entering google url 
	When user is typing the search term "Vijay" 
	And enters the return key 
	Then the user should see the search results
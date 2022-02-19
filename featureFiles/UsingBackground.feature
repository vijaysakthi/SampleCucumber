@UsingBackground 
Feature: To explain usage of background 
#Hooks can also be specified here - This gets priority before background
#One background common for both scenarios
Background: Student completes school education 
	Given the student finishes high school 
	And scored managable marks for college 
	
Scenario: To study medicine 
	Given student applied for medical course 
	When student cleared the entrance exam 
	Then student eligible for joining medical institute 
	
Scenario: To study engineering 
	Given student applied for engineering course 
	When student has a managable cutoff 
	Then student eligible for joining engineering institute
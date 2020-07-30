 Feature: Ebay login Feature. 
Scenario Outline: Ebaly Login page scenario. 
	Given User is into ebay login page 
	When Title is ebay login 
	Then User has enterd "<sname>" and "<password>" 
	Then User is clicked on sign button 
	And User should navigate home page 
	Then close driver
	
Examples:
|sname|password|
|ravindra.channur@gmail.com|Admin@123|	
|ravindra.channur1@gmail.com|Admin@123|	

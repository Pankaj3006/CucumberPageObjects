@Used-Cars
Feature: Acceptance testing to validate Used Cars Search Page is working. 
	
In order to validate that 
the Used Search Cars page is working
Performing the Acceptance Testing

Scenario: Validate Used  Search Cars Page 
	Given I navigate to the Home Page of CarsGuide Website
	When I move to Used Car For Sale Menu
    And click on "Used" link on Menu Page 
	And select carMaker from AnyMake dropdown 
		| carMaker |
		| Audi    |
	And select car model 
		| carModel |
		| A4       |
	And select location from SelectLocation dropdown 
		| location |
		| SA - All |
	#And select "1000" price
	And click on Find_My_Car button 
	Then I should see list of Used cars 
	And the page title should match expected title "Used Audi A4 for Sale SA | carsguide"
	
	
	
	


	
	

	
	
	

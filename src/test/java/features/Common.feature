@Common-Cars 
Feature: Acceptance testing to Validate Buy Cars Page is working. 

Background: 
	Given I am on the Home Page of CarsGuide Website 
	Then I should see list of searched cars
	 
Scenario: Validate Search Cars Page 
	#Given I am on the Home Page of CarsGuide Website 
	When I move to Car For Sale Menu 
	And click on "Search Cars" link 
	And select carbrand as "BMW" from AnyMake dropdown 
	And select "1 Series" as car model 
	And select location as "SA - All" from SelectLocation dropdown 
	And select "1000" as price 
	And click on Find_My_Next_Car button 
	#Then I should see list of searched cars 
	And the page title should be "Bmw 1 Series Under 1000 for Sale SA | carsguide" 
	
Scenario: Validate Used  Search Cars Page 
	#Given I navigate to the Home Page of CarsGuide Website 
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
	#Then I should see list of Used cars 
	And the page title should match expected title "Used Audi A4 for Sale SA | carsguide" 
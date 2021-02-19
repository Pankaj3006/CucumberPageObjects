package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjectLocators.LandingPageLocators;
import pageObjectLocators.UsedCarsLocators;
import utils.TestBase;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import java.util.List;

public class UsedCars extends TestBase
{
	UsedCarsLocators ucl;
	LandingPageLocators lp;

	@Given("^I navigate to the Home Page of CarsGuide Website$")
    public void i_navigate_to_the_home_page_of_carsguide_website() throws Throwable 
    {
    	TestBase.initializeDriver();
    }

    @Then("^I should see list of Used cars$")
    public void i_should_see_list_of_used_cars() throws Throwable
    {
     System.out.println("Car List Found");   
    }

    @And("^select carMaker from AnyMake dropdown$")
    public void select_carmaker_from_anymake_dropdown(List<String> l) throws Throwable 
    { 
       ucl = new UsedCarsLocators();
       ucl.SelectUsedCarname(l.get(1));
    }

    @And("^select car model$")
    public void select_car_model(List<String> l) throws Throwable 
    {
      ucl.SelectUsedCarModel(l.get(1));
    }

    @And("^select location from SelectLocation dropdown$")
    public void select_location_from_selectlocation_dropdown(List<String> l) throws Throwable
    {
        ucl.SelectUsedLocation(l.get(1));
    }

    @And("^click on Find_My_Car button$")
    public void click_on_findmycar_button() throws Throwable 
    {
        ucl.PressFindUsedCarButton();
    }

    @And("^the page title should match expected title \"([^\"]*)\"$")
    public void the_page_title_should_match_expected_title_something(String pagetitle) throws Throwable
    {
    	System.out.println(pagetitle);
    	System.out.println(driver.getTitle());
     Assert.assertEquals(pagetitle, driver.getTitle());  
    }
    
    @When("^I move to Used Car For Sale Menu$")
    public void i_move_to_used_car_for_sale_menu() throws Throwable
    {
        lp = new LandingPageLocators();
        lp.mousehover();
    }

    @And("^click on \"([^\"]*)\" link on Menu Page$")
    public void click_on_something_link_on_menu_page(String link) throws Throwable
    {
       lp.click(link);
    }
  

}
package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjectLocators.LandingPageLocators;
import pageObjectLocators.SearchCarsLocators;
import utils.TestBase;
import cucumber.api.java.en.Then;
import cucumber.api.java.After;
import cucumber.api.java.en.And;

public class SearchCars extends TestBase
{
	SearchCarsLocators scl;
	LandingPageLocators lp;
	
	 @Given("^I am on the Home Page of CarsGuide Website$")
	 public void i_am_on_the_home_page_of_carsguide_website() throws Throwable
	 {
		TestBase.initializeDriver();
	 }

	@Then("^I should see list of searched cars$")
	public void i_should_see_list_of_searched_cars() throws Throwable 
	{
     System.out.println("Car list found");
	}

	@And("^select carbrand as \"([^\"]*)\" from AnyMake dropdown$")
	public void select_carbrand_as_something_from_anymake_dropdown(String carname) throws Throwable
	{
	scl =  new SearchCarsLocators();
    scl.SelectCarname(carname);
	}

	@And("^select \"([^\"]*)\" as car model$")
	public void select_something_as_car_model(String carmodel) throws Throwable 
	{
     scl.SelectCarModel(carmodel);
	}

	@And("^select location as \"([^\"]*)\" from SelectLocation dropdown$")
	public void select_location_as_something_from_selectlocation_dropdown(String loct) throws Throwable
	{
     scl.SelectLocation(loct);
	}

	@And("^select \"([^\"]*)\" as price$")
	public void select_something_as_price(String carprice) throws Throwable
	{
    scl.SelectCarPrice(carprice);
	}

	@And("^click on Find_My_Next_Car button$")
	public void click_on_findmynextcar_button() throws Throwable 
	{
    scl.PressFindCarButton();
	}

	@And("^the page title should be \"([^\"]*)\"$")
	public void the_page_title_should_be_something(String pagetitle) throws Throwable
	{
		System.out.println(pagetitle);
		System.out.println(driver.getTitle());
     Assert.assertEquals(pagetitle, driver.getTitle());
	}
	
	  @When("^I move to Car For Sale Menu$")
	  public void i_move_to_car_for_sale_menu() throws Throwable
	  {
		  lp = new LandingPageLocators();
		  lp.mousehover(); 
	  }

	  @And("^click on \"([^\"]*)\" link$")
	  public void click_on_something_link(String link) throws Throwable
	  {
	  lp.click(link);
	  }
	
	@After
	public void close()
	{
		TestBase.teardown();
	}

}

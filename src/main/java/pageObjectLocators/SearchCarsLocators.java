package pageObjectLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import utils.TestBase;

public class SearchCarsLocators extends TestBase
{
	@FindBy(xpath = "//select[@id='makes']")
	private WebElement CarName;

	@FindBy(xpath = "//select[@id='models']")
	private WebElement CarModel;

	@FindBy(xpath = "//select[@id='locations']")
	private WebElement Location;

	@FindBy(xpath = "//select[@id='priceTo']")
	private WebElement CarPrice;

	@FindBy(xpath = "//input[@id='search-submit']")
	private WebElement FindCarBtn;
	
//	public SearchCarsLocators()
//	{
//		PageFactory.initElements(driver, this);
//	}

	public void SelectCarname(String nameofcar)
	{
		Select s = new Select(CarName);
		s.selectByVisibleText(nameofcar);
	}

	public void SelectCarModel(String modelofcar)
	{
		Select s = new Select(CarModel);
		s.selectByVisibleText(modelofcar);
	}

	public void SelectLocation(String locationofcar)
	{
		Select s = new Select(Location);
		s.selectByVisibleText(locationofcar);
	}

	public void SelectCarPrice(String priceofcar) 
	{
		Select s = new Select(CarPrice);
		s.selectByValue(priceofcar);
	}

	public void PressFindCarButton()
	{
		FindCarBtn.click();
	}

}

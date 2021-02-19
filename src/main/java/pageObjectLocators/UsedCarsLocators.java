package pageObjectLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import utils.TestBase;

public class UsedCarsLocators extends TestBase
{
	@FindBy(xpath = "//select[@id='makes']")
	private WebElement UsedCarName;

	@FindBy(xpath = "//select[@id='models']")
	private WebElement UsedCarModel;

	@FindBy(xpath = "//select[@id='locations']")
	private WebElement UsedLocation;

	@FindBy(xpath = "//select[@id='priceTo']")
	private WebElement UsedCarPrice;

	@FindBy(xpath = "//input[@id='search-submit']")
	private WebElement UsedFindCarBtn;

//	public UsedCarsLocators()
//	{
//		PageFactory.initElements(driver, this);
//	}
	public void SelectUsedCarname(String nameofcar) 
	{
		Select s = new Select(UsedCarName);
		s.selectByVisibleText(nameofcar);
	}

	public void SelectUsedCarModel(String modelofcar)
	{
		Select s = new Select(UsedCarModel);
		s.selectByVisibleText(modelofcar);
	}

	public void SelectUsedLocation(String locationofcar)
	{
		Select s = new Select(UsedLocation);
		s.selectByVisibleText(locationofcar);
	}

	public void SelectUsedCarPrice(String priceofcar)
	{
		Select s = new Select(UsedCarPrice);
		s.selectByValue(priceofcar);
	}

	public void PressFindUsedCarButton()
	{
		UsedFindCarBtn.click();
	}

}

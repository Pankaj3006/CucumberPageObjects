package pageObjectLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utils.TestBase;

public class LandingPageLocators extends TestBase {
	
	@FindBy(xpath = "//a[contains(text(),'buy + sell')]")
	private WebElement buysell;
	
	@FindBy(xpath = "//a[contains(text(),'Search Cars')]")
	private WebElement SearchedCars;
	
	@FindBy(xpath = "//header/div[@id='u_H']/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
	private WebElement UsedCars;
	
//	public LandingPageLocators()
//	{
//		PageFactory.initElements(driver, this);
//	}

	public void mousehover()
	{
		Actions a = new Actions(driver);
		a.moveToElement(buysell).perform();
	}
	
	public void click(String Element)
	{
		if(Element.contains("Search Cars"))
			SearchedCars.click();
		else
			UsedCars.click();
	}
	
}

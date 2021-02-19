package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class TestBase {

	public static WebDriver driver;
	public static Properties config;
	public static FileInputStream file;
		
	public TestBase()
	{
		PageFactory.initElements(driver, this);
	}

	public static void initializeDriver() throws IOException
	{
		config = new Properties();
		file = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\config.properties");
		config.load(file);

		if (config.getProperty("browser").contains("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", "E:\\DRIVER\\Drivers\\Chrome Driver\\chromedriver.exe");
			ChromeOptions ch = new ChromeOptions();
			if (config.getProperty("browser").contains("headless"))
			{
				ch.addArguments("headless");
				driver = new ChromeDriver(ch);
			}
			driver = new ChromeDriver(ch);
		} 
		else 
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(config.getProperty("Url"));
	}
	
	public static void teardown()
	{
		driver.quit();
	}

}

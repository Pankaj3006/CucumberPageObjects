package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\DRIVER\\CucumberPageObjects\\src\\test\\java\\features",
		glue = "Steps",
		monochrome=true,
		//tags="@Used-Cars,@Search-Cars",
		tags="@Common-Cars",
	    plugin="html:target/cucumber")  

public class JunitRunner extends AbstractTestNGCucumberTests {

}

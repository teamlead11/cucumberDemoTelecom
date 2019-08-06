package stepdefinition;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import resources.BaseClass;

public class Hook {
	//public static WebDriver driver;

	@Before
	public static void x() throws MalformedURLException {

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\chromedriver\\chromedriver.exe"); driver = new ChromeDriver();
		 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 */
		 BaseClass.chromeInit();
	}

	@After
	public static void y(Scenario scenario) {
		System.out.println("after method");
		if (scenario.isFailed()) {
			byte[] screenshot = ((TakesScreenshot) BaseClass.driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");

		}

		BaseClass.driver.close();
	}

}

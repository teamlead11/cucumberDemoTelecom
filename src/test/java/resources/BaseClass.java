package resources;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseClass {

	public static WebDriver driver;

	public static void driverInit() {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("UNHANDLED_PROMPT_BEHAVIOUR", "Accept");
		InternetExplorerOptions options = new InternetExplorerOptions(cap).ignoreZoomSettings()
				.introduceFlakinessByIgnoringSecurityDomains();
		System.setProperty("webdriver.ie.driver", "D:\\IEDriver\\IEDriverServer.exe");
		driver = new InternetExplorerDriver(options);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	}

	public static void chromeInit() {

		ChromeOptions options = new ChromeOptions();
		// For use with ChromeDriver:
		options.setAcceptInsecureCerts(true);
		options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
		options.setHeadless(true);
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://www.google.co.in/");
	}
}

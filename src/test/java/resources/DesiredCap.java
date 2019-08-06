package resources;

import java.io.File;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCap {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driverInit();
	}

	public static void driverInit() {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("UNHANDLED_PROMPT_BEHAVIOUR", "Accept");
		InternetExplorerOptions options = new InternetExplorerOptions(cap).introduceFlakinessByIgnoringSecurityDomains().ignoreZoomSettings().withInitialBrowserUrl("google.com");
			//	.introduceFlakinessByIgnoringSecurityDomains().withInitialBrowserUrl("demo");
		System.setProperty("webdriver.ie.driver", "D:\\IEDriver\\IEDriverServer.exe");
		//driver = new InternetExplorerDriver(options);.
		driver = new InternetExplorerDriver(options);
	}

	public static void chromeInit() {

		ChromeOptions options = new ChromeOptions();
		// For use with ChromeDriver:
		options.setAcceptInsecureCerts(true);
		options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
		options.setHeadless(true);
		
		  Proxy proxy = new Proxy(); 
		  proxy.setHttpProxy("demo:8080");
		  options.setProxy(proxy);
		 
		new DesiredCapabilities();
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://www.google.co.in/");
	}
}

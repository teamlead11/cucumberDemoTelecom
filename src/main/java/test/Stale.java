package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		WebElement oldReference = driver.findElement(By.name("q"));
		oldReference.sendKeys("test");

		driver.navigate().refresh();
		WebElement newref = driver.findElement(By.name("q"));
		newref.sendKeys("test staleness");

	}

}

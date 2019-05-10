package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		/*
		 * WebElement ele = driver.switchTo().activeElement();
		 * System.out.println(ele.getAttribute("name"));
		 */
		/*
		 * driver.findElement(By.name("q")).sendKeys("Selenium", Keys.ENTER);
		 * goToPageNew("8");
		 */
		System.out.println(driver.switchTo().activeElement().getAttribute("name"));
	}

	public static void goToPage(String pageNum) {

		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='nav']//td"));
		for (int i = 0; i < cols.size(); i++) {
			if (cols.get(i).getText().equals(pageNum)) {
				cols.get(i).findElement(By.tagName("a")).click();
				break;
			}
		}
	}

	public static void goToPageNew(String pageNum) {
		String locator = "//a[@aria-label='Page $']";
		locator = locator.replace("$", pageNum);
		driver.findElement(By.xpath(locator)).click();

	}

}

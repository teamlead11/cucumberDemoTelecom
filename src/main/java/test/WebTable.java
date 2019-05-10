package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.trainspnrstatus.com/trains");
		driver.manage().window().maximize();
		trainBetweenStation("02:00");
	}

	public static void trainBetweenStation(String time) throws InterruptedException {
		WebElement sourceEle = driver.findElement(By.id("tags"));

		SelectvaluefromTyepAhead(sourceEle, "CHENNAI CENTRAL- MAS", "CHENNAI CENTRAL- MAS");
		WebElement desEle = driver.findElement(By.id("tags1"));
		SelectvaluefromTyepAhead(desEle, "COIMBATORE JN- CBE", "COIMBATORE JN- CBE");
		//driver.findElement(By.xpath("//button[text()='Get Trains Between']")).click();
		List<WebElement> rows = driver.findElements(By.xpath("//table//tr//td"));
		Integer index =1;
		for (int i = 0; i < rows.size(); i++) {
			if (rows.get(i).getText().contains(time)) {
				index=i;
				break;
			}
			String loc="//table//tr[$]//td[2]".replace("$", index.toString());
			System.out.println(driver.findElement(By.xpath(loc)).findElement(By.tagName("a")).getText());
		}
	}

	public static void SelectvaluefromTyepAhead(WebElement ele, String entered, String actual)
			throws InterruptedException {
		ele.sendKeys(entered);
		Thread.sleep(4000);
		ele.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);

		/*
		 * List<WebElement> suggestionElements =
		 * driver.findElements(By.xpath("//ul[@id='ui-id-1']/li")); for(int
		 * i=0;i<suggestionElements.size();i++) {
		 * System.out.println(suggestionElements.get(i).getText());
		 * if(suggestionElements.get(i).getText().equalsIgnoreCase(actual)) {
		 * suggestionElements.get(i).click(); break; }
		 */
	}

}

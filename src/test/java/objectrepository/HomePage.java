package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.BaseClass;
import stepdefinition.Hook;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	@FindBy(xpath = "(//a[text()='Add Customer'])[1]")
	private WebElement lnk_addCustomer;

	public WebElement getLnk_addCustomer() {
		return lnk_addCustomer;
	}
}

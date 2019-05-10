package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition.Hook;

public class AddCustomerPage {

	public AddCustomerPage() {
		PageFactory.initElements(Hook.driver, this);
	}

	@FindBy(xpath = "//label[text()='Done']")
	private WebElement rdo_done;

 //WebElement rdonew_done=Hook.driver.findElement(By.xpath( "//label[text()='Done']"));
 
	@FindBy(id = "fname")
	private WebElement txt_fname;

	@FindBy(id = "lname")
	private WebElement txt_lname;

	@FindBy(id = "email")
	private WebElement txt_email;

	@FindBy(name = "addr")
	private WebElement txt_adress;

	@FindBy(name = "telephoneno")
	private WebElement txt_phnum;

	@FindBy(name = "submit")
	private WebElement btn_submit;

	public WebElement getRdo_done() {
		return rdo_done;
	}

	public WebElement getTxt_fname() {
		return txt_fname;
	}

	public WebElement getTxt_lname() {
		return txt_lname;
	}

	public WebElement getTxt_email() {
		return txt_email;
	}

	public WebElement getTxt_adress() {
		return txt_adress;
	}

	public WebElement getTxt_phnum() {
		return txt_phnum;
	}

	public WebElement getBtn_submit() {
		return btn_submit;
	}

}

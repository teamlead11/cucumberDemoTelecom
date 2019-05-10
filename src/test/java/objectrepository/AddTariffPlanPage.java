package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition.Hook;

public class AddTariffPlanPage {

	public WebElement getSucessmsg() {
		return sucessmsg;
	}

	public AddTariffPlanPage() {
		PageFactory.initElements(Hook.driver, this);
	}

	@FindBy(name = "rental")
	private WebElement rent;

	@FindBy(name = "local_minutes")
	private WebElement loc_min;

	@FindBy(name = "inter_minutes")
	private WebElement inter_min;

	@FindBy(name = "sms_pack")
	private WebElement sms;

	@FindBy(name = "minutes_charges")
	private WebElement min_char;

	@FindBy(name = "inter_charges")
	private WebElement int_char;

	@FindBy(name = "sms_charges")
	private WebElement sms_char;

	@FindBy(xpath="//section[@id='main']//h2")
	private WebElement sucessmsg;
	
	public WebElement getRent() {
		return rent;
	}

	public WebElement getLoc_min() {
		return loc_min;
	}

	public WebElement getInter_min() {
		return inter_min;
	}

	public WebElement getSms() {
		return sms;
	}

	public WebElement getMin_char() {
		return min_char;
	}

	public WebElement getInt_char() {
		return int_char;
	}

	public WebElement getSms_char() {
		return sms_char;
	}

	@FindBy(name = "submit")
	private WebElement sub;

	public WebElement getSub() {
		return sub;
	}
}

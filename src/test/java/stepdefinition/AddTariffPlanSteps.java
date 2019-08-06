package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objectrepository.AddTariffPlanPage;
import resources.BaseClass;
import resources.ReadData;

public class AddTariffPlanSteps extends BaseClass {

	@When("User type the form details{string},{string},{string},{string},{string},{string},{string}")
	public void user_type_the_form_details(String MonthlyRental, String FreeLocalMinutes,
			String FreeInternationalMinutes, String FreeSMSPack, String LocalPerMinutesCharges,
			String InternationalPerMinutesCharges, String SMSPerCharges) {
		AddTariffPlanPage details = new AddTariffPlanPage();
		
		WebDriverWait wait = new WebDriverWait(driver, 10,1000);
		wait.until(ExpectedConditions.elementToBeClickable(BaseClass.driver.findElement(By.id("someid"))));
		details.getRent().sendKeys(MonthlyRental);
		details.getLoc_min().sendKeys(FreeLocalMinutes);
		details.getInter_min().sendKeys(FreeInternationalMinutes);
		details.getSms().sendKeys(FreeSMSPack);
		details.getMin_char().sendKeys(LocalPerMinutesCharges);
		details.getInt_char().sendKeys(InternationalPerMinutesCharges);
		details.getSms_char().sendKeys(SMSPerCharges);

	}

	@When("Click the sumit button")
	public void click_the_sumit_button() {
		AddTariffPlanPage details1 = new AddTariffPlanPage();
		details1.getSub().click();
	}

	@Then("The user should see the success message")
	public void the_user_should_see_the_success_message() {
		// Write code here that turns the phrase above into concrete actions
		AddTariffPlanPage details = new AddTariffPlanPage();
		String actual = details.getSucessmsg().getText();
		Assert.assertEquals("Congratulation you add Tariff Plan", actual);

	}

	@When("The user fill in the tariff plan details {string}")
	public void the_user_fill_in_the_tariff_plan_details(String Excelrow) {
		int row = Integer.parseInt(Excelrow) - 1;

		AddTariffPlanPage details = new AddTariffPlanPage();
		details.getRent().sendKeys(ReadData.mydata.get(row).get("MonthRent"));
		details.getLoc_min().sendKeys(ReadData.mydata.get(row).get("FreeLocal"));
		details.getInter_min().sendKeys(ReadData.mydata.get(row).get("FreeInter"));
		details.getSms().sendKeys(ReadData.mydata.get(row).get("FreeSMS"));
		details.getMin_char().sendKeys(ReadData.mydata.get(row).get("LocalMinutes"));
		details.getInt_char().sendKeys(ReadData.mydata.get(row).get("InterMinutes"));
		details.getSms_char().sendKeys(ReadData.mydata.get(row).get("SMSCharges"));
	}

}

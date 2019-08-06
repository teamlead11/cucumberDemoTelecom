package stepdefinition;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import objectrepository.AddCustomerPage;
import resources.ReadData;

public class AddCustomerSteps {
	@When("The user fill in the form details")
	public void the_user_fill_in_the_form_details(DataTable custDetails) {
		List<Map<String, String>> custDetailsMaps = custDetails.asMaps(String.class, String.class);
		AddCustomerPage customer = new AddCustomerPage();
		System.out.println(custDetailsMaps.get(0).get("AddCustomer"));
		System.out.println(custDetailsMaps.get(0).get("phNum"));
		Integer row = Integer.parseInt(custDetailsMaps.get(0).get("AddCustomer"))-1;
		Integer phNumIndex=Integer.parseInt(custDetailsMaps.get(0).get("phNum"))-1;
		customer.getRdo_done().click();
		customer.getTxt_fname().sendKeys(ReadData.mydata.get(row).get("FirstName"));
		customer.getTxt_lname().sendKeys(ReadData.mydata.get(row).get("LastName"));
		customer.getTxt_email().sendKeys(ReadData.mydata.get(row).get("email"));
		customer.getTxt_phnum().sendKeys(ReadData.mydata.get(phNumIndex).get("phNum"));
		customer.getTxt_adress().sendKeys(ReadData.mydata.get(row).get("adress"));
	}

	@When("The user submits the form")
	public void the_user_submits_the_form() {
		AddCustomerPage customer = new AddCustomerPage();
		customer.getBtn_submit().click();
	}
}

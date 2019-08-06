package stepdefinition;

import org.junit.runner.RunWith;
import org.testng.annotations.BeforeClass;

import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import resources.ReadData;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/AddtariffPlan.feature", glue = { "stepdefinition" }, plugin = {
		"pretty", "json:target/report.json","html:target" }, tags = {  }, monochrome = true, dryRun = false, strict = false)

public class TestRunner{

	@BeforeClass
	public static void readdataFromExcel() {
		ReadData.getData("src/test/resources/files/KhanLive.xlsx", "tariffPlan");

	}
}

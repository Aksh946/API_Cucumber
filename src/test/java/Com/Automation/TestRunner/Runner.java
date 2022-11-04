package Com.Automation.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
		"C:\\Users\\aksh.pundir\\eclipse-workspace\\API_Testing_Cucumber\\src\\test\\resources\\Feature\\Room.feature" }, glue = {
				"Com.Automation.StepsDef" }, monochrome = true, plugin = { "pretty",
						"json:target/myReports/report.json" }, tags = "@POST_Request or @PUT_Request")
public class Runner {

}

package Com.Automation.StepsDef;
import java.io.FileNotFoundException;
import Com.Automation.genericUtils.API_utils;
import Com.Automation.genericUtils.PropertyReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Activities_steps {

	
	 
	//GET Request
	@Given("GET request to base url as {string}  and endLocator as {string}")
	public void get_request_to_base_url_as_and_end_locator_as(String string, String string2) {
		
		API_utils.s_getMethod(PropertyReader.getProperty("BaseURI"),PropertyReader.getProperty("End_GET_POST"));
	}
	
	//POST Request
	@Given("POST request to base URL as {string} and endLocator as {string}")
	public void post_request_to_base_url_as_and_end_locator_as(String string, String string2) throws FileNotFoundException {
	   API_utils.CreateMethod(PropertyReader.getProperty("BaseURI"),PropertyReader.getProperty("End_GET_POST"),PropertyReader.getProperty("File_Path"));
	}

	@Then("Validate response body of POST request.")
	public void validate_response_body_of_post_request() {
	 API_utils.Validation_response_body("id","29");
	 API_utils.Validation_response_body("title","Ongoing_Activities");
	}
	
	
	//PUT Request
	@Given("PUT request to base URL as {string}  and endLocator as {string}")
	public void put_request_to_base_url_as_and_end_locator_as(String string, String string2) throws FileNotFoundException {
	    API_utils.Update_Method(PropertyReader.getProperty("BaseURI"),PropertyReader.getProperty("End_PUT_DELETE"),PropertyReader.getProperty("File_Path"));
	}

	@Then("Validate response body of PUT request")
	public void validate_response_body_of_put_request() {
	   API_utils.Validation_response_body("id","29");
	   API_utils.Validation_response_body("title","Ongoing_Activities");
	}
	//DELETE Request
	@Given("DELETE request to base URL as  {string} and endLocator as {string}")
	public void delete_request_to_base_url_as_and_end_locator_as(String string, String string2) {
	   API_utils.delete_method(PropertyReader.getProperty("BaseURI"),PropertyReader.getProperty("End_PUT_DELETE"));
	}
	
	
	
}

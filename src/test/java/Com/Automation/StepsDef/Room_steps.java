package Com.Automation.StepsDef;

import java.io.FileNotFoundException;

import Com.Automation.genericUtils.API_utils;
import Com.Automation.genericUtils.PropertyReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Room_steps {

	@Given("GET request to base url as {string}  and endLocator as {string} to Room_restAPI.")
	public void get_request_to_base_url_as_and_end_locator_as_to_room_rest_api(String string, String string2) {
	  API_utils.s_getMethod("https://automationintesting.online","room");
	}

	@Given("POST request to base URL as {string} and endLocator as {string} to Room_restAPI.")
	public void post_request_to_base_url_as_and_end_locator_as_to_room_rest_api(String string, String string2) throws FileNotFoundException {
	   API_utils.CreateMethod(PropertyReader.getProperty("BaseURI_room"),PropertyReader.getProperty("EndLocator_post_room"),PropertyReader.getProperty("File_path_room"));
	}

	@Then("Validate response body of POST request of Room_restAPI.")
	public void validate_response_body_of_post_request_of_room_rest_api() {
	   API_utils.Validation_response_body("status","success");
	   API_utils.Validation_response_body("message","Successfully! Record has been added.");
	}

	@Given("PUT request to base URL as {string}  and endLocator as {string} to Room_restAPI.")
	public void put_request_to_base_url_as_and_end_locator_as_to_room_rest_api(String string, String string2) throws FileNotFoundException {
		API_utils.Update_Method(PropertyReader.getProperty("BaseURI_room"), PropertyReader.getProperty("EndLocator_put_room"),PropertyReader.getProperty("File_path_room"));
	}

	@Then("Validate response body of PUT request of Room_restAPI")
	public void validate_response_body_of_put_request_of_room_rest_api() {
	    API_utils.Validation_response_body("status","success");
		API_utils.Validation_response_body("message","Successfully! Record has been updated.");
		API_utils.Validation_response_body("data.roomid","50");
	}

	@Given("DELETE request to base URL as  {string} and endLocator as {string} to Room_restAPI.")
	public void delete_request_to_base_url_as_and_end_locator_as_to_room_rest_api(String string, String string2) {
	   API_utils.delete_method(PropertyReader.getProperty("BaseURI_room"),PropertyReader.getProperty("EndLocator_delete_room"));
	}

}

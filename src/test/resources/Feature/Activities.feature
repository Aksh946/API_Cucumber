Feature: Verify the REST API -> Activities using java_based_library .

@GET_Request
Scenario: Using GET request to fetch data.
Given GET request to base url as "BASE_URI"  and endLocator as "END_Locator"

@POST_Request
Scenario: Using POST request to add information within the request body.
Given POST request to base URL as "BASE_URI" and endLocator as "END_Locator"
Then Validate response body of POST request.

@PUT_Request
Scenario: Using PUT request to update information on server.
Given PUT request to base URL as "BASE_URI"  and endLocator as "END_Locator"
Then Validate response body of PUT request

@DELETE_Request
Scenario: Using DELETE request to perform delete operation
Given DELETE request to base URL as  "BASE_URI" and endLocator as "END_Locator"

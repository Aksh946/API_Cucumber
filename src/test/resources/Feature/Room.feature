Feature: Verify the REST API -> Room using java_based_library.

@GET_Request
Scenario: Using GET request to fetch data from Room_restAPI.
Given GET request to base url as "BASE_URI"  and endLocator as "END_Locator" to Room_restAPI.

@POST_Request
Scenario: Using POST request to add information within the request body from Room_restAPI.
Given POST request to base URL as "BASE_URI" and endLocator as "END_Locator" to Room_restAPI.
Then Validate response body of POST request of Room_restAPI.

@PUT_Request
Scenario: Using PUT request to update information on server from Room_restAPI.
Given PUT request to base URL as "BASE_URI"  and endLocator as "END_Locator" to Room_restAPI.
Then Validate response body of PUT request of Room_restAPI

@DELETE_Request
Scenario: Using DELETE request to perform delete operation from Room_restAPI.
Given DELETE request to base URL as  "BASE_URI" and endLocator as "END_Locator" to Room_restAPI.

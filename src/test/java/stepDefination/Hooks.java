package stepDefination;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {
	@Before("@deleteResource")
public void beforeScenario() throws IOException {
		StepDefinationOfMapAPI stp= new StepDefinationOfMapAPI();
		stp.payload_of_add_place_api_with("fromHooks", "English", "Europ");
		if(StepDefinationOfMapAPI.place_Id==null) {
		stp.user_calls_with_http_request("AddPLaceAPI", "Post");
		stp.verify_place_id_created_in_map_to_using("name", "GetPlaceAPI");
		}
}
}

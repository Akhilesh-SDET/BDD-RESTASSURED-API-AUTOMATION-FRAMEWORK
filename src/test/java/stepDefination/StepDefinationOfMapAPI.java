package stepDefination;
import static io.restassured.RestAssured.given;

import java.io.IOException;

import genericUtility.RestAssuredUtility;
import genericUtility.getJsonPath;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import junit.framework.Assert;
import payLoadCreationHelper.AddPlacePayloadHelper;
import payLoadCreationHelper.DeletePayloadHelper;
import resource.APIResource;

public class StepDefinationOfMapAPI extends RestAssuredUtility {
	RequestSpecification reqspc;
	ResponseSpecification responsespc;
	Response response;
	JsonPath jp;
	String houseOwnerName;
	static String place_Id;
	
	
	@Given("payload of AddPlace API with {string} {string},{string}")
	public void payload_of_add_place_api_with(String name, String language, String address) throws IOException {
		houseOwnerName=name;
		 reqspc = given()
		 .spec(requestSpecification())
		 .body(AddPlacePayloadHelper.AddplacePayload(name,language,address));
		}
	
	@When("user calls {string} with  http request {string}")
	public void user_calls_with_http_request(String resource, String httpMethodName) {
		
	   System.out.println("from when");
	   APIResource resourceAPI = APIResource.valueOf(resource);
	   if(httpMethodName.equalsIgnoreCase("post")) {
	   response = reqspc.when().post(resourceAPI.getresource());
	   }else if(httpMethodName.equalsIgnoreCase("GET")) {
		   response = reqspc.when().get(resourceAPI.getresource());
	   }else if(httpMethodName.equalsIgnoreCase("delete")) {
		   response = reqspc.when().delete(resourceAPI.getresource());
	   }
	   			
	}

	@Then("the API call is success with status code {int}")
	public void the_api_call_is_success_with_status_code(Integer int1) {
		System.out.println("from Then");
		response=response.then()
		   .extract().response();
	}

	@Then("{string} in response body is {string}")
	public void in_response_body_is(String key, String value) {
	   System.out.println("from last");
		Assert.assertEquals(getJsonPath.getJsonpath(response,key), value);
	}
	@Then("verify place_Id created in map  to {string} using {string}")
	public void verify_place_id_created_in_map_to_using(String name, String resource) throws IOException {
	   //reqestspec
		 place_Id=getJsonPath.getJsonpath(response,"place_id");
		reqspc = given()
				 .spec(requestSpecification()).queryParam("place_id",place_Id);
		
		user_calls_with_http_request(resource,"GET");
		String nam = getJsonPath.getJsonpath(response,name);
		Assert.assertEquals(nam, houseOwnerName);
	}
	@Given("pre condition of delete API")
	public void pre_condition_of_delete_api() throws IOException {
		reqspc=given(). given()
		 .spec(requestSpecification())
		 .body(DeletePayloadHelper.payloadOfDeleteAPI(place_Id));
	}

}
 
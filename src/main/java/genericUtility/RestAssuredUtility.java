package genericUtility;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RestAssuredUtility {
  public static	RequestSpecification resp;
public RequestSpecification requestSpecification() throws IOException {
	if(resp==null) {
	PrintStream log = new PrintStream(new FileOutputStream("logginf.txt"));
	 resp = new RequestSpecBuilder()
	.setBaseUri(PropertyFileUtils.getGlobalValue("BaseURL"))
	.addQueryParam("key", "qaclick123")
	.addFilter(RequestLoggingFilter.logRequestTo(log))
	.addFilter(ResponseLoggingFilter.logResponseTo(log))
	.setContentType(ContentType.JSON).build();
	 return resp;
	}
	return resp;
}
}

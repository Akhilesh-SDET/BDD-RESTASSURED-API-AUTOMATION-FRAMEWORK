package genericUtility;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class getJsonPath {
public static String getJsonpath(Response response,String key) {
	JsonPath jp = new JsonPath(response.asString());
	String shhd = jp.getString(key).toString();
	return shhd;
	
}
}

package payLoadCreationHelper;

public class DeletePayloadHelper {
public static String payloadOfDeleteAPI(String place_Id) {
	return "{\r\n"
			+ "     \"place_id\": \""+place_Id+"\"\r\n"
			+ "}";
}
}

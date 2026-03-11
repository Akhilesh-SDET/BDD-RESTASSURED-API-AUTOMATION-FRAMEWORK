package payLoadCreationHelper;
import java.util.Arrays;

import dto.map.AddPlaceDto;
import dto.map.LocationDTO;

public class AddPlacePayloadHelper {

	public static AddPlaceDto AddplacePayload(String name, String language , String address) {
		AddPlaceDto place=new AddPlaceDto();
		place.setAccuracy(50);
		place.setName(name);
		place.setPhone_number("2233654598");
		place.setAddress(address);
		place.setWebsite("http://google.com");
		place.setLanguage(language);
		place.setTypes(Arrays.asList(new String[]{"BikeServicing","Servicing"}));
		LocationDTO lo =new LocationDTO();
		lo.setLng(33.427362);
		lo.setLat(-38.383494);
		place.setLocation(lo);
		return place;
	}
	
}

package resource;

public enum APIResource {

	AddPLaceAPI("/maps/api/place/add/json"),
	GetPlaceAPI("/maps/api/place/get/json"),
	DeletePlaceAPI("/maps/api/place/delete/json");
	String resource;
	
	APIResource(String resource){
		this.resource=resource;
	}
	public String getresource() {
		return resource;
	}
}

package URI_Resource;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class resource {
	private RequestSpecification httpRequest;
	private String baseURI;
	private Response response;
	private JsonPath jsonPathEvaluator;
	
	public resource() {
	}
	
	public void SetBaseURI(String URI) {
		this.baseURI = URI;
	}
	
	public void InitHttpRequest() {
		RestAssured.baseURI = "https://www.transportnsw.info/web";
		this.httpRequest = RestAssured.given();
	}
	
	
	public void SendGetRequest(String requestURI) {
		this.response = httpRequest.request(Method.GET, requestURI);
		//String responseBody = response.getBody().asString();
		//System.out.println("Response Body is =>  " + responseBody);
	}
	
	public String GetActualStationName() {
		this.jsonPathEvaluator = response.jsonPath();
		return jsonPathEvaluator.get("locations[0].name");
	}
	
	public Integer GetLocationModeNum(){
		List<Integer> modes = jsonPathEvaluator.getList("locations[0].modes");
		return modes.size();
	}
}


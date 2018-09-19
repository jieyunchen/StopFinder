package step_definitions;


import static org.junit.Assert.*;
import URI_Resource.resource;
import cucumber.api.java.en.*;



public class StopFinderSteps {
	
	resource URIResource;
	
	public StopFinderSteps(resource URIResource) {
		this.URIResource = URIResource;
	}

	@Given("Phileas is looking for a stop")
	public void phileasIsLookingForAStop() {
		URIResource.SetBaseURI("https://www.transportnsw.info/web");
		URIResource.InitHttpRequest();
	}

	
	@When("he searches for {string}")
	public void heSearchesFor(String string) {
		String requestURI = "/XML_STOPFINDER_REQUEST?TfNSWSF=true&language=en&name_sf=" + string + "&outputFormat=rapidJSON&type_sf=any&version=10.2.2.48";
		URIResource.SendGetRequest(requestURI);
	}

	@Then("a stop named {string} is found")
	public void aStopNamedIsFound(String string) {
		assertEquals(string, URIResource.GetActualStationName());
	}

	@Then("the stop provides more than one mode of transport")
	public void theStopProvidesMoreThanOneModeOfTransport() {
		assertTrue(URIResource.GetLocationModeNum() > 1);
	}

}

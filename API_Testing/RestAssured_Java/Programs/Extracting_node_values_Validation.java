import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class AllValues {
	
	@Test
	public void validateCompleteResponse() {
		RequestSpecification re = RestAssured.given();
		Response response = re.get("http://restapi.demoqa.com/utilities/weather/city/Mumbai");
		
		// Extracting values from Response Body
		JsonPath jsonpath = response.jsonPath();
		System.out.println(jsonpath.get("City"));        // will return the value of City node
		System.out.println(jsonpath.get("Humidity"));
		
		
		// Validating node value
		Assert.assertEquals(jsonpath.get("Temperature"), "31 Degree celsius");
	}

}

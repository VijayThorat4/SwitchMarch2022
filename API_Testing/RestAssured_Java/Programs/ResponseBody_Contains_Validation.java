import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class ResponseBodyValidation {
	
	@Test
	public void responseBody() {
		RequestSpecification re = RestAssured.given();
		Response response = re.get("http://restapi.demoqa.com/utilities/weather/city/Delhi");
		String responseBody = response.getBody().asString();
		System.out.println(responseBody);
		
		// Verifying some expected value is present in response body or not
		Assert.assertEquals(responseBody.contains("Delhi"), true); 
	}
}

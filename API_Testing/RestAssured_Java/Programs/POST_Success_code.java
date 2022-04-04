import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class MyClass {
	
	@Test
	public void postRequest() {
		
		RequestSpecification re = RestAssured.given();
		
		// Request Payload sending along with POST request
		JSONObject requestParams = new JSONObject();
		requestParams.put("FirstName", "Vijay1");
		requestParams.put("LastName", "Thorat1");
		requestParams.put("UserName", "VJ1");
		requestParams.put("Password", "12345611");
		requestParams.put("Email", "vijay1@thorat.com");
		
		re.header("Content-Type", "application/json");
		
		re.body(requestParams.toJSONString());
		
		// Creating the response object
		Response response = re.post("http://restapi.demoqa.com/customer/register");
		
		// Printing response
		String responseBody = response.getBody().asString();
		System.out.println(responseBody);
		
		// Success Code validation
		String successCode = response.jsonPath().get("SuccessCode");
		Assert.assertEquals(successCode, "OPERATION_SUCCESS");		
	}
}

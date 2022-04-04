package dsdfdf;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Auth {
	
	@Test
	public void test5() {
		int code = RestAssured.given()
		.auth().preemptive()
		.basic("ToolsQA", "TestPassword")
		.when()
		.get("http://restapi.demoqa.com/authentication/CheckForAuthentication")
		.getStatusCode();
		
		System.out.println("Response code from server is " + code);
	}
}

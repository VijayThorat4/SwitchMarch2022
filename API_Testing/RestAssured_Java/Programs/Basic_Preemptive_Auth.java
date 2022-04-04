import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class NewClass {
	
	@Test
	public void Autherization() {
		
		// Basic Authentication
		PreemptiveBasicAuthScheme authscheme = new PreemptiveBasicAuthScheme();
		authscheme.setUserName("ToolsQA");
		authscheme.setPassword("TestPassword");
		RestAssured.authentication=authscheme;
		
		RequestSpecification re = RestAssured.given();
		Response response = re.get("http://restapi.demoqa.com/authentication/CheckForAuthentication/");
		
		String responseBody = response.getBody().asString();
		System.out.println(responseBody);
		
		int reCode = response.getStatusCode();
		System.out.println(reCode);
	}

}

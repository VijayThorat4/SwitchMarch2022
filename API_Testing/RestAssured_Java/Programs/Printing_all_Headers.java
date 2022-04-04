import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Reading_Headers {

	@Test
	public void printHeaders() {
		
		RequestSpecification re = RestAssured.given();
		Response response = re.get("http://restapi.demoqa.com/utilities/weather/city/Pune");
		String responseBody = response.getBody().asString();
		System.out.println(responseBody);
		
		Headers allHeaders = response.headers();   //capture all headers from response
		
		// Printing all the headers
		for (Header header:allHeaders) {
			System.out.println(header.getName() + "    " + header.getValue());	
		}
	}
}

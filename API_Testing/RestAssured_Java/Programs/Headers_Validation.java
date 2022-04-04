import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Header_Validation {
	
	@Test
	public void headerVali() {
		
		RequestSpecification re = RestAssured.given();
		Response response = re.get("https://maps.googleapis.com/maps/api/place/nearbysearch/xml?location=-33.8670522,151.1957362&radius=1500&type=supermarket&key=AIzaSyBjGCE3VpLU4lgTqSTDmHmJ2HoELb4Jy1s");
		String responseBody = response.getBody().asString();
		System.out.println(responseBody);
		
		// Validating Headers
		String contentType = response.header("Content-Type");   // ‘Content-Type’ is one of the headers
		System.out.println("Contenet-Type header value is " + contentType);
		Assert.assertEquals(contentType, "application/xml; charset=UTF-8");

		String contentEncoding = response.header("Content-Encoding");   // ‘Content-Type’ is one of the headers
		System.out.println("Contenet-Encoding header value is " + contentType);
		Assert.assertEquals(contentEncoding, "gzip");
	}
}

package visualCrossingRestAssurePackage;
import  org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
//import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class HTTPRequests {

	@Test

	void getUser()
	{
		given()
		
		.when()
		     .get("https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/New%20Delhi?unitGroup=metric&key=Q9VS8DZT8ZYP9A8V7QWE7YWWC&contentType=json")
		
		.then()
		         .statusCode(200)
		         
		         .body("timezone", equalTo("Asia/Kolkata"))
		         .body("address",equalTo("New%20Delhi"))
		         .body("resolvedAddress", equalTo("No 20 Street, Sant Garh, Tilak Nagar, Delhi 110018, India"))
		         .body("description", equalTo("Similar temperatures continuing with a chance of rain Tuesday, Wednesday & Thursday."))
		         .log().all();   

	}
	
}

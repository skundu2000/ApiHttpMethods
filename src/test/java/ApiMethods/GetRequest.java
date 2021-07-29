package ApiMethods;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class GetRequest {
  @Test
  public void postRequest() {
	  
	  //reqres post request
	  String endpoint = "https://reqres.in/api/users?page=2";
	  
	 given().
	 when().get(endpoint).
	 then().statusCode(200).
	 body("data.id[0]" , equalTo(7)).
	 body("data.email[0]" , equalTo("michael.lawson@reqres.in")).
	 body("data.first_name[0]" , equalTo("Michael")).
	 body("data.last_name[0]" , equalTo("Lawson")).
	 body("data.avatar[0]" , equalTo("https://reqres.in/img/faces/7-image.jpg")).log().all();
	
  }
}

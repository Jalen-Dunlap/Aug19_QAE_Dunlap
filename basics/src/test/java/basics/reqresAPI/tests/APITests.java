package basics.reqresAPI.tests;

//import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;



public class APITests {

	@Test
	public void canGetSingleUserAndVerifyEmail() {
		Response response = RestAssured.get("https://reqres.in/api/users/2");

		response.prettyPrint();

		response
		.then()
		.assertThat()
		.body("data.id", equalTo(5)
				,"data.email",equalTo("janet.weaver@reqres.in"));
	}
	
	@Test
	public void canPostSuccessfullyAndVerifyToken() {
		setBaseURI("/login");
		
		RestAssured.given()
		.queryParam("email", "eve.holt@reqres.in")
			.and().queryParam("password", "pistol")
			.body("")
		.when()
			.post()
		.then()
			.assertThat()
			.body("token", equalTo("QpwL5tke4Pnpja7X4"));
	}
	
	@Test
	public void canDeleteAndGetResponseCode() {
		setBaseURI("/users/2");
		
		RestAssured.given()
			.body("")
		.when()
			.delete()
		.then()
			.assertThat()
			.statusCode(204);
		
		/*
		 * The HTTP 204 No Content success status response code indicates that a request has succeeded, 
		 * but that the client doesn't need to navigate away from its current page. This might be used,
		 *  for example, when implementing "save and continue editing" functionality for a wiki site.
		 */
	}

	public void setBaseURI(String url) {
		RestAssured.baseURI = "https://reqres.in/api" + url;
	}
}

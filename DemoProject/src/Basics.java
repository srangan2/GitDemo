import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;

import Files.payload;


public class Basics {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Validate add place API is working as expected
		
		//Given, - All the input details
		//when, -  Submit API 
		//then, - Validate the response
		//Content of the file to String --> content of file can convert into Byte-->Byte data to String
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String response=given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
		.body(new String(Files.readAllBytes(Paths.get("C:\\Users\\hssri\\OneDrive\\Desktop\\Automation Learning\\RestAssured\\AddPlace.json"))))
		.when().post("maps/api/place/add/json").then().log().all().
		assertThat()
		.statusCode(200)
		.body("scope",equalTo("APP"))
		.header("server", equalTo("Apache/2.4.52 (Ubuntu)")).extract().asString();
		
		System.out.println(response);
		JsonPath js=new JsonPath(response);// for parsing JSON
		String placeId =js.getString("place_id");
		System.out.println("placeId: "+placeId);
		
		//update Place
		String newAddress = "Summer Walk, Africa";
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body("{\r\n"
				+ "\"place_id\":\""+placeId+"\",\r\n"
				+ "\"address\":\""+newAddress+"\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}").
		when().put("maps/api/place/update/json")
		.then().assertThat().log().all().statusCode(200).body("msg", equalTo("Address successfully updated"));
		
		
		//Add place --> update place with new address-> get place to validate if New address is present in response
		
		//get place
		String getPlaceResponse =given().log().all().queryParam("key", "qaclick123")
				.queryParam("place_id", placeId)
		.when().get("maps/api/place/get/json")
		.then().assertThat().log().all().statusCode(200).extract().response().asString();
		
		JsonPath js1 = new JsonPath(getPlaceResponse);
		String actualAddress = js1.getString("address");
		System.out.println(actualAddress);
		Assert.assertEquals(actualAddress, newAddress);
		// Cucumber Junit and Testng
	}

}

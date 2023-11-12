import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import Files.ReusableMethods;
import Files.payload;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class DynamicJson {
	@Test(dataProvider = "BooksData")
	public void addBook(String aisle, String isbn)
	{
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String  resp=given().

				header("Content-Type","application/json").

				body(payload.Addbook(isbn,aisle)).

				when().

				post("/Library/Addbook.php").

				then().assertThat().statusCode(200).

				extract().response().asString();

				JsonPath js= ReusableMethods.rawtoJson(resp);

				   String id=js.get("ID");

				   System.out.println(id);
	}
	
	@DataProvider(name="BooksData")
	public Object[][] getData()
	{
		return new Object[][] {{"019","abcab"},{"020","defde"},{"021","ghigh"}};
	}

}

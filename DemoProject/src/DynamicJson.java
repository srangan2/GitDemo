import io.restassured.RestAssured;

public class DynamicJson {
	@Test
	public void addBook()
	{
		RestAssured.baseURI = "http://216.10.245.166"
	}

}
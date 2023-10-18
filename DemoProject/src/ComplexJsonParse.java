import Files.payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JsonPath js = new JsonPath(payload.CoursePrice());
		//Print No Courses returned by API
		
		int count =js.getInt("courses.size()");
				System.out.println(count);
				
		//Print purchase amount
				
		int totalamount = js.getInt("dashboard.purchaseAmount");
				System.out.println(totalamount);
				
		//Print title of the first course
				
		String titileFirstCourse =js.get("courses[2].title");
		System.out.println(titileFirstCourse);
		
		//Print all Course titles and their respective Prices
		
		for (int i=0;i<count;i++)
		{
			String coursesTitles=js.get("courses["+i+"].title");
			System.out.println(js.get("courses["+i+"].price").toString());
			System.out.println(coursesTitles);
		}
		
		for (int i=0;i<count;i++)
		{
			String coursesPrices=js.get("courses["+i+"].price").toString();
			System.out.println(coursesPrices);
		}
	}

}

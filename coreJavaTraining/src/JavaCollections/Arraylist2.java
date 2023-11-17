package JavaCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> Arr =  new ArrayList<String>();
		Arr.add("Rahul");
		Arr.add("Anu");
		Arr.add("Aanvi");
		Arr.add("Appa");
		Arr.get(3);
		System.out.println(Arr.get(3));
		
		for(int i=0;i<Arr.size();i++)
		{
			System.out.println(Arr.get(i));
		}
		System.out.println("*******************");

		for (String val :Arr)
		{
			System.out.println(val);
		}
		System.out.println(Arr.contains("Aanvi"));
		System.out.println("*******************");
		String[] namelist = {"Rahul","Aanvi", "Anuradha"};
		List<String>nameArrayList = Arrays.asList(namelist);
		
		System.out.println(nameArrayList.contains("Aanvi"));
		
		
		
		
		
	}


}
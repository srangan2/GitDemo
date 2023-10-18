package JavaCollections;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hash Set, tree set, LinkedHashset implements Set interface
		//doesn't accept duplicate value 
		// There is no guranteee elements stored in sequental order
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("india");
		hs.add("india");
		hs.add("india");
		hs.add("he");
		hs.add("she");
		System.out.println(hs);
	
		System.out.println(hs.remove("UK"));
		System.out.println(hs.isEmpty());
	System.out.println(hs.size());
	
	//Iterator :
	
	Iterator<String> i=hs.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());	
	}
	
	
	
	
	
	}

}

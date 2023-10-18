package coreJavaTraining;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a ="hello"; // String Literal
		String b="hello";
		
		String s = new String("hello");
		String S1 = new String("hello");
		
		a.concat("World");
		System.out.println(a);
		System.out.println(a.equals(b));;
		System.out.println(a==b);
		System.out.println(a.equals(s)); // equals opereator check for the content true
		System.out.println(a==s);// == check for the reference
		
		
		
		// String Buffer and String Builder
		
		StringBuffer sb = new StringBuffer("hello");
		sb.append("World");
		System.out.println(sb);
		sb.insert(2, "she");
		System.out.println(sb);
		sb.replace(5, 7, "ff");
		System.out.println(sb);
		sb.deleteCharAt(12);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		//String Builder is not thread Safe. It is non synchronized, it is faster than String buffer
		
		StringBuilder sbb=new StringBuilder("helloa");
		sbb.append("World");
		System.out.println(sbb);
		sbb.insert(2, "she");
		System.out.println(sbb);
		sbb.replace(5, 7, "ff");
		System.out.println(sbb);
		sbb.deleteCharAt(12);
		System.out.println(sbb);
		sbb.reverse();
		System.out.println(sbb);
	}

}

package Stringsprograms;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class StringReversalkeepingspace {
	
	static String s = "Rahul Shetty Acadaemy";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int length = s.length();
		char[] chArr = s.toCharArray();
		
		for(int i=chArr.length-1;i>=0;i--)
		{
			System.out.print(chArr[i]);
			
		}
		System.out.println("");
		
		
	
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		

		
		
	}

}

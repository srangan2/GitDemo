package Stringsprograms;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class StringReversalkeepingspace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Rahul Shetty Academy";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		
	}

}

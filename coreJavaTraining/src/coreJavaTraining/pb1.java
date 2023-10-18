package coreJavaTraining;

public class pb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//nested loop
		
	/*	for(int i=1;i<=4;i++)
		{
			System.out.println("Outer Loop Started");
			for(int j=1;j<=4;j++)
			{
				System.out.println("Inner loop");
			}
			System.out.println("Outer loop finished");
		}
		*/
		
		int k=1;
		for(int i=0;i<4;i++)
		{
			//System.out.println("Outer Loop Started");
			for(int j=1;j<=4-i;j++)
			{
				System.out.print(k+" ");
				//System.out.println("\t");
				k++;
			}
			System.out.println( "");
		}
	
		int m=1;
		for(int i=0;i<4;i++)
		{
			//System.out.println("Outer Loop Started");
			for(int j=1;j>=4-i;j--)
			{
				System.out.print(m+" ");
				//System.out.println("\t");
				k++;
			}
			System.out.println( "");
		}
		

	}
}
	
	
	
	
/*1 2 3 4
5 6 7
8 9
10*/
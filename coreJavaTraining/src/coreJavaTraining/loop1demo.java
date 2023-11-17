package coreJavaTraining;

public class loop1demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//nested loop
	/*	
		for(int a=1;a<=4;a++)
		{
			System.out.println("Outer Loop Started");
			for(int b=1;b<=4;b++)
			{
				System.out.println("Inner loop");
			}
			System.out.println("Outer loop finished");
		}
		*/
		int k=1;
		for (int i=0;i<=4;i++)
		{
		for(int j=1;j<=4-i;j++)
		{
			System.out.print(k+"\t");
			k++;
		}
		System.out.println("");
		}

	}
}
	
	
	
	
/*1 2 3 4
5 6 7
8 9
10*/

/*
1
2 3
4 5 6
7 8 9 10
*/
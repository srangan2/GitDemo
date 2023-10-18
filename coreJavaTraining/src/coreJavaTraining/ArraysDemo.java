package coreJavaTraining;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[5];
		a[0] = 2;
		a[1] = 3;
		a[2] = 4;
		a[3] = 5;
		a[4]= 6;
		
		int b[]= {7,8,9,10,11};
		
		for(int i =0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		for(int i =0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}

}

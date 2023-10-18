package Interfaceandoops1;

import Interfaceandoops.parentdemoSuper;

public class ChilddemoSuper extends childtempsuper {
	
	String name = "Anuradha";
	
	public ChilddemoSuper()
	{
		super();//it should be always be first line
		System.out.println("Parent class construtor");
	}
	 
	public void getstringdata()
	{
		System.out.println(name);
		System.out.println(super.name);
	}

	public void getdata()
	{
		super.getdata();
		System.out.println("I am in child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChilddemoSuper cd = new ChilddemoSuper();
		cd.getstringdata();
		cd.getdata();
		
	}

}
 
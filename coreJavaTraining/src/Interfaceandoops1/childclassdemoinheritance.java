package Interfaceandoops1;

import Interfaceandoops.parentclassdemoinheritance;

public class childclassdemoinheritance extends parentclassdemoinheritance {

	public void engine()
	{
		System.out.println("engine code is implemented");
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		childclassdemoinheritance cd = new childclassdemoinheritance();
		cd.audiosystem();
		cd.brakes();
		cd.Gear();
		cd.color();
	}

}

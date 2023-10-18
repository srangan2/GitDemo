package Interfaceandoops1;

import Interfaceandoops.ParentAirCraft;

public class ChildEmiritesabstract extends ParentAirCraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildEmiritesabstract c = new ChildEmiritesabstract();
		c.engine();
		c.safetyGuidelines();
		c.bodyColor();
		
	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		{
			System.out.println("Red color on the body");
		}
	}

}

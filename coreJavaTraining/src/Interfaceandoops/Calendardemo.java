package Interfaceandoops;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calendardemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleDateFormat sd = new SimpleDateFormat("MM/d/yyyy hh:mm:ss");
		Calendar cal  =Calendar.getInstance();
		System.out.println(sd.format(cal.getTime()));;
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(cal.get(Calendar.AM_PM));
		System.out.println(cal.get(Calendar.AM_PM));
		System.out.println(cal.get(Calendar.MINUTE));
		
	
	}

}

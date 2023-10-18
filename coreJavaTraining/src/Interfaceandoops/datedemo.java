package Interfaceandoops;

import java.text.SimpleDateFormat;
import java.util.Date;

public class datedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("MM/d/yyyy");
		SimpleDateFormat sd1 = new SimpleDateFormat("MM/d/yyyy hh:mm:ss");
		//System.out.println(d.toString());
		System.out.println(sd.format(d));
		System.out.println(sd1.format(d));
	}

}

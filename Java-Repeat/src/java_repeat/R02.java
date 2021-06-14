package java_repeat;

import javax.swing.JOptionPane;

public class R02 {
	
	public static void main(String[] args) {
		
		// Pokriva K03 Omotaci i K04 BrojevnaKruznica
		// Omotaci
		
		
		int i = Integer.parseInt("7");
		
		System.out.println(i);
		
		// poziv za unos korinsika, showinputDialog izbacuje poruku
		
		System.out.println(i);JOptionPane.showInputDialog("Daj cijeli broj");
		
		// komanda nadodaje 10 na unos korisnika
		
		System.out.println(i+10);
		
		// izbacuje min i max vrijednosti integera
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		boolean da=Boolean.parseBoolean("true");
		
		System.out.println(da);

		byte broj1 = Byte.parseByte("23");

		System.out.println(broj1);
		
		short broj2 =Short.parseShort("12");
		
		System.out.println(broj2);

		int broj3 = 27363;
		
		System.out.println(broj3);

		long broj4 = Long.parseLong("23243756472566");
		
		System.out.println(broj4);

		float broj5 =Float.parseFloat("3.14");

		System.out.println(broj5);
		
		double broj6 =Double.parseDouble("3.14");
		
		System.out.println(broj6);

		char znak1= Character.forDigit(148, 10);
		
		System.out.println(znak1);
		
		// Brojevna kružnica
		// Ako gurneš broj preko maxa ideš u negativu
		
		int maxnumber = Integer.MAX_VALUE;
		System.out.println(maxnumber);
		
		maxnumber = maxnumber+1;
		
		System.out.println(maxnumber);
		
		
	}
	
}




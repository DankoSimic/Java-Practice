package java_task;

import javax.swing.JOptionPane;

public class Tasks02 {

	public static void main(String[] args) {
		
		// Zadatak 1
		// korisnik unosi cijeli broj
		// za parni broj se ispisuje Osijek
		// za neparni broj se ispisuje Donji Miholjac
			
		int a;
		
		a=Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));
		
		if (a % 2 == 0) { 
			System.out.println("Osijek");
		} else {
			System.out.println("Donji Miholjac");
		}	

		// dodatno zadatak 1
		// U sluèaju unosa parnog broja tražiti unos
		// dva cijela broja i ispisati zbroj

		// u slučaju unosa neparnog broja tražiti unos
		// decimalnog broja i ispisati samo cijeli dio
		
		// Zadatak 2
		// Program unosi dva cijela broja od korisnika
		// program ispisuje veæi uneseni broj
		
		int b,c ;
		
		b=Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi cijeli broj"));
		c=Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi cijeli broj"));
		
		if (b>c) {
			System.out.println(b);
		} else if (c>b) {
			System.out.println(c);
		} else {
			System.out.println("brojevi su jednaki");
		}
		
		// Zadatak 3
		// Program unosi tri cijela broja od korisnika
		// program ispisuje najmanji uneseni broj
		
		int d,e,f ;
		
		d=Integer.parseInt(JOptionPane.showInputDialog("Cijeli broj 1"));
		e=Integer.parseInt(JOptionPane.showInputDialog("Cijeli broj 2"));
		f=Integer.parseInt(JOptionPane.showInputDialog("Cijeli broj 3"));
		
		if (d<e && d<f) {
			System.out.println(d);
		} else if (e<d && e<f) {
			System.out.println(e);
		} else if (f<d && f<e) {
			System.out.println(f);
		} else { 
			System.out.println("Sva tri broja su jednaka");
		}
		
		// Zadatak 4 - primitivni kalkulator
		// Korisnika unosi prvo operaciju:
		// 1 - zbrajanje
		// 2 - oduzimanje
		// 3 - množenje
		// 4 - djeljenje
		// za sve ostale unose program ispisuje: GREŠKA i završava se
		// Korisnik unosi dva decimalna broja
		// U odnosu na odabranu operaciju program ispisuje rezultat
		// Ako je rezultat cijeli broj tada se ispisuje bez .0
		
		int g,h,i,j;
		
		//
		// Zadatak 5
		// Program unosi dva cijela broja.
		// U slučaju da je zbroj unesenih brojeva veći od 10 
		// i razlika prvog i drugog manja od 0 program ispisuje
		// Osijek, inaće ispisuje Donji Miholjac.
		
		int k,l;
		
		int operacija_zbroj;
		int operacija_razlika;
		
		k = Integer.parseInt(JOptionPane.showInputDialog("Daj cijeli broj 1"));
		l = Integer.parseInt(JOptionPane.showInputDialog("Daj cijeli broj 2"));
		
		operacija_zbroj = k + l;
		operacija_razlika = k - l;
		
		if (operacija_zbroj>10 && operacija_razlika<0) {
			System.out.println("Osijek");
		} else  {
			System.out.println("Donji Miholjac");
		}
		
		
		
	}
	
}


	
	






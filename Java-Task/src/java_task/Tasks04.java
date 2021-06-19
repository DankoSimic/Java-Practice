package java_task;

import javax.swing.JOptionPane;

public class Tasks04 {
	
	public static void main(String[] args) {
		
		//Program unosi 2 broja i ispisuje zbroj
		
		int a,b,c;
		a = 2;
		b = 3;
		c = a+b;
		
		System.out.println(c);
		
		// program od korisnika unosi 2 decimalna broja
		// ispisuje veći
		
		double d,e;
		
		d = Double.parseDouble(JOptionPane.showInputDialog("Unesi decimalni broj"));
		e = Double.parseDouble(JOptionPane.showInputDialog("Unesi drugi decimalni broj"));
		
		if(d>e) {System.out.println(d);
		
		} else if (e>d) {System.out.println(e);
			
		} else {System.out.println("Jednaki su");
			
		}
		
		// Program ispisuje sve brojeve od 100 do 21
		// jedno do drugoga odvojeno zarezom
		
		// Nađi poslije za zarez
		// Preumoran za noćni 
		
		int f,g;
		f = 21;
		g = 100;
		
		for (int i=g;i>=f;i--) {
			System.out.println(i );}
		
	}

}

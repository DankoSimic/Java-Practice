package java_task;

import javax.swing.JOptionPane;

public class Tasks04 {
	
	public static void main(String[] args) {
		
		// Zadatak 1
		// Program unosi 2 broja i ispisuje zbroj
		
		int a,b,c;
		a = 2;
		b = 3;
		c = a+b;
		
		System.out.println(c);
		
		// Zadatak 2
		// program od korisnika unosi 2 decimalna broja
		// ispisuje veći
		
		double d,e;
		
		d = Double.parseDouble(JOptionPane.showInputDialog("Unesi decimalni broj"));
		e = Double.parseDouble(JOptionPane.showInputDialog("Unesi drugi decimalni broj"));
		
		if(d>e) {System.out.println(d);
		
		} else if (e>d) {System.out.println(e);
			
		} else {System.out.println("Jednaki su");
			
		}
		
		// Zadatak 3
		// Program ispisuje sve brojeve od 100 do 21
		// jedno do drugoga odvojeno zarezom
		
		// Riješio zarez
		
		int f,g;
		f = 21;
		g = 100;
		
		for (int i=g;i>=f;i--) {
			System.out.println(i + "," );}
		
		// Zadatak 12
		// Program ispisuje "Edunova" (ispisuju se i navodnici)
		
		System.out.println("\"Edunova\"");
		
		// Zadatak 10
		// Ispiši Sve parne brojeve od 3 do 47
		
		int h,j;
		h = 3;
		j = 47;
		
		for(int i=h;i>=j;i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		// Zadatak 4
		// Program učitava cijele brojeve od korisnika
		// sve dok se ne učita broj 0. Tada se program završava
		
		int k;
		
		for(;;) { k = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj, program završava kad upišeš 0"));
			if ( k == 0 )
				break;
		}
			}
		}




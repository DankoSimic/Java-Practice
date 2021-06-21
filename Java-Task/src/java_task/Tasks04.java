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
			
		// Zadatak 4
		// Program učitava cijele brojeve od korisnika
		// sve dok se ne učita broj 0. Tada se program završava
		
		int k;
		
		for(;;) { k = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj, program završava kad upišeš 0"));
			if ( k == 0 )
				break;
		}
		
		// Zadatak 5
		// Program od korisnika unosi dva parna broja
		// Program ispisuje njohov zbroj
		
		int l,m;
		
		for (;;) { 
			l = Integer.parseInt(JOptionPane.showInputDialog("Unesi paran broj"));
			m = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi paran broj"));
			if (l % 2 == 0 && m % 2 == 0) {
				System.out.println(l+m);
				break;
			} else {JOptionPane.showInternalMessageDialog(null,"Nisi upisao parne brojeve");}
			}

		// Zadatak 6
		// Program unosi 10 cijelih brojeva od korisnika
		// u jednodimenzionalni niz
		// Program ispisuje sve elemente niza
		
		// Zadatak 7
		// Prim broj je broj koji je cjelobrojno djeljiv sam s sobom
		// i s broj 1.
		// Za uneseni broj x = 27353 ispišite da li je prim broj

		// Zadatak 8
		// Program ispisuje matricu 15 x 15
		// tako da je svaki element matrice broj 0
		
		// Zadatak 9
		//Program od korisnika unosi brojeve
		// sve dok korisnik ne unese broj 0
		//Program ispisuje zbroj svih unesenih brojeva
		
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
		
		// Zadatak 11
		// Za dva dana broja ispišite decimalni dio rezultata
		// djeljenja
		
		// treba još dio za decimalno - NOT DONE
		
		double n,o,p;
		n = Double.parseDouble(JOptionPane.showInputDialog("Unesi broj"));
		o = Double.parseDouble(JOptionPane.showInputDialog("Unesi drugi broj"));
		p = (n/o);
		
		System.out.println(p);
		
		// Zadatak 12
		// Program ispisuje "Edunova" (ispisuju se i navodnici)
		
		System.out.println("\"Edunova\"");
		
		
			}
		}




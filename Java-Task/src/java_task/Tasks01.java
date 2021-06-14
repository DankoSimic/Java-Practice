package java_task;

import javax.swing.JOptionPane;

public class Tasks01 {

	public static void main(String[] args) {
		
		// deklarirajte varijablu za pohranu tjelesne
		// temperature čovjeka kao int i dodjelite 
		// vrijednost 36
		
		int tjelesna_temperatura;
		
		tjelesna_temperatura = 36;

		// deklarirajte varijablu za temperaturu
		// mjesta kao int i dodjelite 
		// vrijednost -9. Ispišite deklariranu vrijednost
		
		int temperatura_mjesta;
		
		temperatura_mjesta =-9;
		
		System.out.println(temperatura_mjesta);
		
		// Korisnik učitava dva cijela broja
		// prpgram ispisuje njivog zbroj
		
		int a , b, c ;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		
		b = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		
		c = a + b;
		
		System.out.println(c);

		// Program od korisnika učitava tri broja
		// program ispisuje zbroj prvog i trećeg
		// podjeljen s drugim unesenim brojem	
		
		int d , e , f, g ;
		
		d = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj 1"));
		
		e = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj 2"));
		
		f = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj 3"));
		
		g = (d+e)/f;
		
		System.out.println(g);
		
		// Korisnik unosi dvoznamenkasti broj
		// Program ispisuje prvu znamenku
		
		// Nije rješen, vrati se na ovo poslije
		
//		int h;
//		
//		h = Integer.parseInt(JOptionPane.showInputDialog("Unesi dvoznamenkasti broj"));
//		
//		System.out.println(h);
		
	}
	
}

		
		
		

		
		

		

		


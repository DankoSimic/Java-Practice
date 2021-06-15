package java_repeat;

import java.util.Arrays;

public class R09 {
	
	public static void main(String[] args) {
		
		// pošto ne želimo ispisivati nešto hrpetinu puta stvaramo niz
		
		int sijecanjTemperatura = 12;
		
		// Ovdje deklariramo niz pod nazivom temp koji označava temperaturu za 12 polja odnosno mjeseci
		
		int [] temp;
		
		// Ovdje inicijaliziramo niz i kažemo da ima 12 polja
		
		temp = new int [12];
		
		// Ovdje unosimo podatke za dva polja. Index odnosno prvo polje uvijek je 0.
		
		temp [0] = -2;
		temp [5] = 22;
		
		System.out.println(temp);
		System.out.println(Arrays.toString(temp));
		
		// Drugi tip sintaxe, omdah uspostavljamo niz pod imenom niz i dajemo mu 5 polja
		
		int niz[] = new int [5];
		
		System.out.println(Arrays.toString(niz));
		
		// ovdje dajemo vrijednost 348 na polje 1
		
		niz [1] = 348;
		System.out.println(niz[1]);
		
		// Sljedeća print komanda nam pokazuje da je 348 upisano na polje 1
		
		System.out.println(Arrays.toString(niz));
		
		// Ovdje uspostavljamo niz brzo i odmah mu dajemo koliko polja ima i sve upise
		
		int[] brzo = {2,3,5,6,7,4,3};
		System.out.println(Arrays.toString(brzo));
			
	}

}

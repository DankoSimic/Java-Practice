package java_task;

import java.util.Arrays;

public class Tasks03 {

	public static void main(String[] args) {
		
		//Program učitava 5 decimalnih brojeva u niz
		//Program ispisuje prvi i posljednji element niza
		
		// Varijanta 1
		
		double niz [] = new double [5];
		
		niz[0] = 1.1;
		niz[1] = 1.2;
		niz[2] = 1.3;
		niz[3] = 1.4;
		niz[4] = 1.5;
				
		System.out.println(niz[0]);
		System.out.println(niz[4]);
		
		// Varijanta 2
		
		double [] niz2 = {1.1,1.2,1.3,1.4,1.5};
		System.out.println(niz2[0]);
		System.out.println(niz2[4]);	
		
		// Program unosi 5 cijelih brojeva u niz
		// Program ispisuje najveći uneseni broj
		
		// Dosta sam siguran da ovo može jednostavnije
		
		int broj [] = new int [5];
		
		broj[0] = 1;
		broj[1] = 2;
		broj[2] = 3;
		broj[3] = 4;
		broj[4] = 5;
		
		if(broj[0]>broj[1]&broj[0]>broj[2]&broj[0]>broj[3]&broj[0]>broj[4]) {
			System.out.println(broj[0]);
		} else if (broj[1]>broj[2]&broj[1]>broj[3]&broj[1]>broj[4]&broj[1]>broj[0]) {
			System.out.println(broj[1]);
		} else if (broj[2]>broj[3]&broj[2]>broj[4]&broj[2]>broj[0]&broj[2]>broj[1]) {
			System.out.println(broj[2]);
		} else if (broj[3]>broj[4]&broj[3]>broj[0]&broj[3]>broj[1]&broj[3]>broj[2]) {
			System.out.println(broj[3]);
		} else if (broj[4]>broj[0]&broj[4]>broj[1]&broj[4]>broj[2]&broj[4]>broj[3]) {
			System.out.println(broj[4]);
		}
	}
	
}

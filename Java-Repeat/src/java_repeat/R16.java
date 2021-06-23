package java_repeat;

import java.util.Arrays;

public class R16 {
	
	public static void main(String[] args) {
		
		int niz[] = {2,3,2,3,2,4,3};
		
		// izbacuje niz od i je 0 do i je duljina niza s pomcianjem od 1 po nizu
		// i na to doda odvajanje zarezom
		
		for (int i=0;i<niz.length;i++) {
			System.out.println(niz[i] + ",");
		}
		
		// For each uvijek treba jednu varijablu koja će sadržavati pojedini element niza
		// Ok ovdje dobijemo isto koristeći i:niz
		
		System.out.println();
		
		for (int i:niz) {
			System.out.println(i + ",");
		}
		
	}

}

package java_repeat;

public class R01 {
	
	public static void main(String[] args) {
		
// Pokriva K01 Varijable i K02 Primitivni Tipovi		
// Varijable

		// deklarirana varijabla kao cijeli broj, vrijednost 1
		int i=1;
		
		// deklaracija varijable i naknadno dodjeljivanje vrijednosti
		
		int t;
		
		t=7;
		
		// korištenje varijable
		
		System.out.println(t);
		
// Primitivni tipovi
		
		// boolean tip podataka true/flase
		
		boolean da=true;
				
		boolean ne=false;
		
		System.out.println(da);
		System.out.println(ne);

		// byte tip podataka brojevi do 127
		
		byte broj1 = 50;
		
		byte broj11 = 126; 
		
		// ako stavim više od 127 odmah baca error
		
		byte broj111 = 127;
		
		// ide od -128 do 127
		
		byte broj1111 = -128;
		
		System.out.println(broj1);
		System.out.println(broj11);
		System.out.println(broj111);
		System.out.println(broj1111);
		
		// short tip podataka brojevi do 32767
		
		short broj2 = 128;
		
		short broj22 = 250;
		
		short broj222 = 278;
		
		// ide od -32768 do 32767
		
		short broj2222 = 32767;
		
		short broj22222 = -32768;
		
		System.out.println(broj2);
		System.out.println(broj22);
		System.out.println(broj222);
		System.out.println(broj2222);
		System.out.println(broj22222);
		
		// integer tip podataka
		
		int broj3 = 50000;
		
		// nije mi se dalo ici u kalkulator potencirat 2 na 31 pa sam samo gurao kolko 0 ide
		
		int broj33 = 500000000;
		
		System.out.println(broj3);
		System.out.println(broj33);

		// long tip podataka
		
		long broj4 = 500000000;
		
		// iako pise da bi trebalo biti 2 na 63 dobivam error ako dodam više 0 nego u int, a zbilja mi se ne da ra�?unati koji bi trebao biti max
		
		System.out.println(broj4);
		
		// float tip podataka, manji decimalni broj
		
		float broj5 = 2.25f;
		
		// f na kraju potreban u protivnom error zbog konverzije iz double u float
		
		float broj55 = 2.2525252525252525252525f;
		
		System.out.println(broj5);
		System.out.println(broj55);
		
		// double tip podataka, veći decimalni broj
		
		double broj6 = 3e10;
		
		// ignorira apsurdne 0
		
		double broj66=3.22500000000000000000000000000000000000000000000000000000125;
		
		// automatski zakružuje kod apsurdnog decimalnog nakon određenog broja
		
		double broj666=3.222545478975647987651324657987;
		
		System.out.println(broj6);
		System.out.println(broj66);
		System.out.println(broj666);
	
		// char tip podataka, izbacuje bilo koji jedan character
		
		char znak1='A';
		char znak2='?';
		char znak3='Č';
		
		System.out.println(znak1);
		System.out.println(znak2);
		System.out.println(znak3);
		
	}

}
		

		
		

package java_repeat;

public class R03 {
	
	public static void main(String[] args) {
		
		int a = 10, b= 15;
		
		int c = a+b;
		
		int d = 12, e = 4;
		
		int f = d / e;
		
		int g = 8, h = 16;
		
		int i = g / h;
		
		// ako ostavim pod int, iznos na i će izbaciti 0 jer je rezultat decimalni
		
		System.out.println(c);
		System.out.println(f);
		System.out.println(i);
		
		// float je cast
		
		float fi =(float) g / h;
		
		System.out.println(fi);
		
		// što ako ne stavim f u deklaraciju ?
		
		float z=(float) g / h;
		
		System.out.println(z);
		
		// ok, samo smo stavili f u "fi" radi raspoznavanja
		
		float fr = (float) a / b; // (float) je cast

		// operator modulo
		// ostavlja u integeru
		
		System.out.println(10/3);
		System.out.println(5*8);
		System.out.println(10-7);
		
		// ostatak, korisno za par/nepar
		
		int y = 9 % 2;

		System.out.println(y);
	}

}





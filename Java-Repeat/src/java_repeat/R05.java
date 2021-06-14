package java_repeat;

public class R05 {
	
	public static void main(String[] args) {
		
		// If Operatori
		
		int t=2, j=3;
		
		// operatori uspoređivanja i logički
		// logički AND
		
		// provjerava oba uvjeta
		
		if (t>=2 & j==3) {
			System.out.println("OK 1");
		}

		// && prvo provjerava prvi uvijet ako ne štima uopće ne gleda dalje
		
		if (t>=2 && j==3) {
			System.out.println("OK 2");
		}
		
		// logički OR
		// | provjerava oba uvijeta

		if (t>2 | j==3) {
			System.out.println("OK 3");
		}
		
		// || u slučaju da prvi uvjet štima, ne gleda dalje
	
		if (t==2 || j<0) { 
			System.out.println("OK 4");
		}

		// logički NOT
		// !
		
		if (!(t==0 || j==3)) {
			System.out.println("OK 5");
		}
		
		// nepotrebno
		if (!(t==3)) {
			System.out.println("OK 6");
		}
		
		// mjesto toga koristiti
		
		if (t!=3) {
			System.out.println("OK 7");
		}
		
	}

}



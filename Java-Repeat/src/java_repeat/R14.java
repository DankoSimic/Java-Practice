package java_repeat;

public class R14 {

	public static void main(String[] args) {
		
		// Beskonačna while petlja
		
		// Dokle god je while true, izbacuj Osijek
		// Break zaustavlja
		
		while (true) {
			System.out.println("Osijek");
			break;	
		}

		System.out.println();
		
		// i je 10, dokle god je i veći od 0 ispisuj ga i nakon toga umanji za 1
		// dobijemo ispis od 10 do 1
		
		int i = 10;
		while(i>0) {
			System.out.println(i--);
		}
		
		System.out.println();
		
		// j je 3, i je 1, dokle god su oba uvjeta zadovoljena, primarno i je manje od 10 ispisuj ga i nakon toga povećaj za 1
		// dobijemo ispis od 1 do 9
		
		int j=3; i=1;
		
		while (j==3 & i<10) {
			System.out.println(i++);
		}
		
		}
}
		
	


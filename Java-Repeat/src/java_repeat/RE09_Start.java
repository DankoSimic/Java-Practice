package java_repeat;

public class RE09_Start {
	
	// Životni Vijek Objekta
	// 1. objekt je zamišljen ali "ne živi" - vrijednost null
	private RE09_Osoba polaznik;
	
	public RE09_Start() {
		
		// osoba je objekt - instanca variable
		// Objekt je instanca klase
		// new poziva konstruktor
		RE09_Osoba osoba = new RE09_Osoba();
		
		System.out.println(osoba.getIme());
		
		// postavljanje vrijednosti
		
		osoba.setIme("Pero");
		
		// dohvaćanje vrijednosti
		
		System.out.println(osoba.getIme());
		
		
		zivotniVijekObjekta();
		
	}
	
	private void zivotniVijekObjekta() {
		System.out.println(polaznik);
		// nullpointer exception
		System.out.println(polaznik.getIme());
		// 2. konstruiranje objekta
		polaznik = new RE09_Osoba();
		
		// 3. radni vijek
		polaznik.setIme("Marija");
		System.out.println(polaznik.getIme());
		
		// 4. uništenje
		// Ne moramo brinuti o uništenju jer to radi GC ( Grabage Collector)
	}

	public static void main(String[] args) {
		
		new RE09_Start();
			
	}

}

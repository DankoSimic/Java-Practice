package java_repeat;

public class RE09_Osoba {

	// Klasa je opisnik objekta
	
	// OOP princip učahurivanje
	// Klasa će učahuriti (sakriti) svoja svojstva
	// i učiniti ih dostupnim putm javnim get set metoda
	
	private String ime;

	
	// konstruktor
	// izvršava se pri izvođenju dijela koda - new
	public RE09_Osoba () {
		ime ="Marko";
	}
	
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}
	
}

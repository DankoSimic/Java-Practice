package java_repeat.primjer1;

import javax.swing.JOptionPane;

public class RE09_Start {
	
	
	// 5. Priprema se niz objekata
	private RE09_Olovka[] olovke;
	
	// 4. Definira se konstruktor
	public RE09_Start() {
		olovke = new RE09_Olovka[3];
		ucitajOlovke();
		ispisiUcitano();
		
		

	}
	
	// 7. Ispisivanje vrijednosti
	private void ispisiUcitano() {
		int ukupnaDuzina=0;
		for(RE09_Olovka olovka: olovke) {
			System.out.println(olovka.getMaterijal() + 
					" " + olovka.getBoja());
			ukupnaDuzina+=olovka.getDuzina();
		}
		
		// ispisati ukupnu dužinu svih unesenih olovaka
		System.out.println("Ukupna dužina svih olovaka je " + ukupnaDuzina);
		
		// rješenje 2
		System.out.println(ukupnaDužina());
		
	}
	private int ukupnaDužina() {
		int u = 0;
		for(RE09_Olovka o: olovke) {
			u+=o.getDuzina();
		}
		return u;
	}

	// 7. punjenje - učitavanje vrijednosti
	private void ucitajOlovke() {
		RE09_Olovka olovka;
		for (int i=0;i<3;i++) {
			olovka = new RE09_Olovka();
			olovka.setBoja(JOptionPane.showInputDialog((i+1) + ". boja"));
			olovka.setMaterijal(JOptionPane.showInputDialog((i+1) + ". materijal"));
			olovka.setDuzina(
					Integer.parseInt(
							JOptionPane.showInputDialog((i+1) + ". dužina"))
					);
			olovke[i] = olovka;
		}
		
	}

	public static void main(String[] args) {
		
		new RE09_Start();
		
	}

}

package java_repeat.primjer2;

import javax.swing.JOptionPane;

public class RE09_Program {
	
	private RE09_Mjesto mjesto;
	
	public RE09_Program() {
		mjesto=new RE09_Mjesto ();
		ucitajMjesto();
		ispisiDetalje();
	}

	private void ispisiDetalje() {
		// ispiši broj stanovnika mjesta
		System.out.println(mjesto.getBrojStanovnika());
		
		// ispiši naziv mjesta
		System.out.println(mjesto.getNaziv());
		
		// ispiši naziv županije
		System.out.println(mjesto.getZupanija().getNaziv());
		
		
	}

	private void ucitajMjesto() {
		mjesto.setNaziv("Unesi naziv mjesta");
		mjesto.setBrojStanovnika(
				Integer.parseInt(
						JOptionPane.showInputDialog("Unesi broj stanovnika")
						)
				);
		mjesto.setZupanija(ucitajZupaniju());
		
	}

	private RE09_Zupanija ucitajZupaniju() {
		RE09_Zupanija zupanija = new RE09_Zupanija ();
		
		zupanija.setNaziv(JOptionPane.showInputDialog("Unesi naziv županije"));
		zupanija.setZupan(JOptionPane.showInputDialog("Unesi župana"));
		
		return zupanija;
	}

	public static void main(String[] args) {
		
		new RE09_Program();
		
	}
	
}

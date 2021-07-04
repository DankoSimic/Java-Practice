package java_repeat;

import java_repeat.koristenjemetoda.RE08_Ulaz;

public class RE08_MetodeStart {
	
	public static void main(String[] args) {
		
		// m je varijabla
		// ispravnije je reæi da je m varijabla instance
		RE08_Metode m = new RE08_Metode();
		
		// poziv metode
		m.ispis();
		m.ispis("Edunova");
		System.out.println(m.zbroj(2, 3));
		
		RE08_Primjer p = new RE08_Primjer();
		p.postaviGodine(28);
		p.ispisiGodine();
		
		RE08_Primjer.VRIJEDNOST=7;
		System.out.println(RE08_Primjer.VRIJEDNOST);
		
		RE08_Primjer.VRIJEDNOST=8;
		System.out.println(RE08_Primjer.VRIJEDNOST);
		
		// ne pristupati putem varijable
		m.posao();
		
		//veæ pozivati putem klase
		RE08_Metode.posao();
	
		
		
		
	}

}

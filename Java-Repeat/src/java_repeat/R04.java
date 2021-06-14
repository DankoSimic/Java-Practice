package java_repeat;

public class R04 {

	public static void main(String[] args) {
		
		// UvjetnoGrananjeIf
		
		int i = 0; 
		
		// if binarno uvjetno grananje s dva ishoda - boolean
		
		boolean uvjet = i > 5;
		
		System.out.println(uvjet);
		
		// minimalna forma
		
		if (uvjet) {
			System.out.println("uvjet je veći od 5");	
			
		}
		// uobičajena forma
			
		if (i == 0) {
			System.out.println("i je 0");
		}
		
		// puna forma if naredbe
		
		if (i == 0) {
			System.out.println("Ok");
		} else { 
			i = i + 1;
			System.out.println(i);		
		}
	
		// primjer else if naredbe
		
		int j = 2 ;
		
		if (j==0) {
			i=5;
		} else if (j==1) {
			i=6;
		} else {
			i=7;
		}
				
		System.out.println(i);
			
}

}







package java_repeat;

public class R06 {
	
	public static void main(String[] args) {
		
		// InlineIF
		
		int i=4;
		
		if(i==4) {
			System.out.println("OK");
		} else {
			System.out.println("NE");
		}
		
		// tercijarni operator ?
		// ? provodi odmah if i else u jednom redu
		// Ako je i jednako 4 izbaci ok u protivnom izbaci ne
		
		
		System.out.println(i==4 ? "OK" : "NE");
		
		// Ako je i jednako 4 izbaci ok u protivnom ako je j jednako 3 izbaci da 
		// u protivnom izbaci ne
		
		int j=2;
		System.out.println(i==4 ? "OK" :
			j==3 ? "DA" : "NE");
		
	}

}

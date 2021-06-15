package java_repeat;

public class R11 {

	public static void main(String[] args) {
		
		// Petlja ili iteracije LOOP odnosno ponavljanje istog koda x puta
		
		// 10 Ispisa bez petlje
		
		System.out.println("Osijek");
		System.out.println("Osijek");
		System.out.println("Osijek");
		System.out.println("Osijek");
		System.out.println("Osijek");
		System.out.println("Osijek");
		System.out.println("Osijek");
		System.out.println("Osijek");
		System.out.println("Osijek");
		System.out.println("Osijek");
		
		System.out.println();
		
		// Sintaxa petlje - for
		// for (od kuda; do kuda; uvećanje/umanjenje)
		
		// Ovo izbacuje print line "Osijek" 10 puta
		
		for(int i=0;i<10;i=i+1) {
			System.out.println("Osijek");
		}
		
		System.out.println();
		
		// Ovo ispisuje brojeve 0 do 9
		
		for(int i=0;i<10;i=i+1) {
			System.out.println(i);
		}
		
		System.out.println();
		
		// Ovo ispisuje brojeve 1 do 10
		
		for(int i=1;i<=10;i=i+1) {
			System.out.println(i);
		}
		
		System.out.println();
		
		// Ispisuje od 5 do 10
		
		int odKuda = 5, doKuda=10;
		
		for(int i=odKuda;i<=doKuda;i=i+1) {
			System.out.println(i);
		}

		System.out.println();
		
		// Ispisuje od 10 do 1
		// increment od sada pišemo s i++ odnosno i--
		
		for(int i=10;i>0;i--) {
			System.out.println(i);
		}
		
		
	}
	
}

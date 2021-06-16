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
		
		// zbroj prvih 100 brojeva
		
		int zbroj = 0;
		for (int i=0;i<=100;i++) {
			zbroj+=i;
		}
		
		System.out.println(zbroj);

		System.out.println();
		
		// Ognježđivanje petlje
		// i ide od 1 do 10, j ide od 1 do 10
		// Ok kontam da smo dobili nizove 1,2,3 / 2,4,6 / 3,6,9 ali ne mogu iz ovoga skontat kako ni zašto
		
		for (int i=1;i<=10;i++) {
			for (int j=1;j<=10;j++) {
				System.out.print(i*j + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// preskakanje - nastavak izvođenja petlje
		// ja sam ovo pretipko no trebat ce da skontam
		
		int preskoci = 4;
		for(int i=0;i<10;i++) {
			if(preskoci==i) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println();	
		
		// nasilno prekidanje petlje
		// ako ovo dobro shvaćam, ide od 0 do 9, kad dođemo do 4 zaustavi
		// ajd to sam skonto
		
		for (int i=0;i<10;i++) {
			if(i==preskoci) {
				break;
			}
			System.out.println(i);
		}
		
		// nasilno prekidanje petlje
		// labela
		
		vanjska:
			for(int i=1;i<=10;i++) {
				for(int j=1;j<10;j++) {
					if(j==4) {
						break vanjska;
					}
				}
			}
		
	}
	
}

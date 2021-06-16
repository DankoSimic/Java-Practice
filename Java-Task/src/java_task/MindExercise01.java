package java_task;

public class MindExercise01 {
	
	public static void main(String[] args) {
		
//		int t=0, k=1;
//		t = ++k; //t = 2, k=2
//		k = ++t - k--; //t = 3, k=1
//		System.out.println(k+t--); //4
		
		int a=2, b=3;
		b = --a; // Pretpostavka da je b=1 / OK
		System.out.println(b);		
		a = ++b + a--; // Pretpostavka da je a = prvo uvećani b + a umanjen za 1 što je 2+1 a=3 /OK
		System.out.println(a);
		System.out.println(++a+b); // Pretpostavka da je a=5 / NE rez je 6, zaboravio si da si uvećao b za 1
		
		System.out.println();
		
		int d=1, e=2;
		d = --e - d; // d = -1 - 1, d = 0 / OK
		System.out.println(d);
		d = ++e; // d = 1+e, pri ćemu je e 2-1=1 dakle d =2 / OK
		System.out.println(d);
		e = d * 2; // d = 2, e = 2 * 2, dakle e = 4 / OK
		System.out.println(e);
		System.out.println(--e+d--); // sad ide wild guess e=4,d=2 no e je umanjen za 1 prije zbroja dakle 5 // BINGO
		
		System.out.println();
		
		int f=4, g=0;
		g= ++f - 1; // g=4
		System.out.println(g);
		f= ++f - g--; // f = 5 - 3 odnosno f=2
		System.out.println(f);
		System.out.println(f*g); // 2 * 3 = 6 // YES. Ok ide brže
		
		System.out.println();
		
	}

}

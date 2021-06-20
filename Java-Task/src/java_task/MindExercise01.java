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
		
		int i=2, j=1;
		j = --j; // j=0 / Ok
		System.out.println(j);
		i = ++i - j++ ; // i = 3 - 0 nakon čega je i=3 a j=1 / Ok
		System.out.println(i);
		System.out.println(i-j); // treba biti 2 / Ok
		
		System.out.println();		
		
		int k=3, l=1;
		k = --k + --l; // k = 2 / OK
		System.out.println(k);
		l = --l +2; // l = 1 / OK
		System.out.println(l);
		k = ++k - ++l; // k= 3-2 = 1 / OK
		System.out.println(k);
		System.out.println(k*l); // 1*2 = 2 / OK
		
		System.out.println();
		
		int m=4, n=1;
		m = m / ++n; // 4/2 m = 2
		System.out.println(m);
		n = ++m + ++n; // n = 3 + 3, n = 6
		System.out.println(n);
		System.out.println(n-m); // 6-3 = 3
		
		// 1d4 za operaciju. 1 zbrajanje 2 oduzimanje 3 množenje 4 djeljenje
		// 1d6 za broj
		// 1d6 za increment, decrement. 1(++i) 2(i) 3(i++) 4(--i) 5(i) 6(i--)
		
		System.out.println();
		
		int o=5, p=1;
		o = o++ + p; // o = 5 + 1, o = 6
		System.out.println(o); // OK
		p = --p * ++o; // p = 0 * 7, p = 0
		System.out.println(p); // OK
		System.out.println(--o + --p); // 6 + -1
		
		System.out.println();
		
		int r=2, s=2;
		s = --r * --s; // 1*1 s=1 , r=1
		System.out.println(s); // OK
		r = r-- * --s; // 1*0 r=0, s=0
		System.out.println(r); // OK
		s = --r + ++r; // -1 + 1 = 0 s=0, r=0 
		System.out.println(r/s); // 0 OK
		
		System.out.println();
		
		int t=3, u=6;
		t = --u - --t; // 5-2 t=3 , u=5
		System.out.println(t); // OK
		u = u++ - ++t; // 5 - 4, t=4, u=1
		System.out.println(u); // OK
		t = u++; // t=1, u=2
		System.out.println(t); // OK
		System.out.println(t/u); // 0 OK
				
		
	}

}

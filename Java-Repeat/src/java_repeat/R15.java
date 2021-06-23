package java_repeat;

public class R15 {
	
	public static void main(String[] args) {
		
		int t = 15;
		for (int i=20;i<t;i++) {
			System.out.println("Osijek");
			}
		
		// Ne izbacuje ništa je t nije veći od 20
		
		while (t>20 ) {
			System.out.println("Edunova");
		}
		
		// osigurava minimalno jedno izvođenje
		// U osnovi kaže učini x, u ovom slučaju izbaci Java i nastavi to činiti dokle god je t veće od 20
		
		do {
			System.out.println("Java");
		} while (t>20);
		
		
		}
		
	}
	

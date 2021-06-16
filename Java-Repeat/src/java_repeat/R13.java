package java_repeat;

public class R13 {
	
	public static void main(String[] args) {
		
		// Iteracija Nizova
		// Ok tu smo dobili da ispiše niz
		
		int[] niz = {2,3,4,5,6,3,7,0};
	
		
		System.out.println(niz);
	
		// Aha, ako stavim samo print dobijem "bezvezni" ispis dok doljnja komanda omogućuje ispis svih elemenata niza
		
		for(int i=0;i<niz.length;i++) {
		System.out.println(niz[i]);
		}
		
	}

}



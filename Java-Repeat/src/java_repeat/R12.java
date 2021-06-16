package java_repeat;

public class R12 {

	public static void main(String[] args) {
		
		// Increment / Decrement
		
		// Kažemo imamo intger i i on je 0
		// Print to kaže
		
		int i=0;
		System.out.println(i);
		
		// Sad kažemo da je integer i=i+1 gdje on uzima prijašnju vrijednost 0, pridodaje 1 i dobivamo 1
		// Print to kaže
		
		i=1+1;
		System.out.println(i);
		
		// ako koristimo sintaxu i+=1 ili 1++ radimo isto i dobivamo 2 i 3
		// Print to kaže
		
		i+=1;
		System.out.println(i);
		i++;
		System.out.println(i);
		
		// isto vrijedi i za ostale operacije - * / %
		
		System.out.println();
		
		// increment
		// i++ prvo koristi pa uveća
		
		i=0; // tu je i = 0
		System.out.println(i++); // tu prvo ispiše 0 a onda doda i pamti da je i nakon toga 1
		System.out.println(i); // tu ispiše tih 1
		
		// ++1 prvo uveća pa koristi
		
		System.out.println(++i); // uveća prijašnju vrijednost 1 za 1 i onda ispiše 2
		
		// decrement po istom principu i-- i --i
		
	}
	
}
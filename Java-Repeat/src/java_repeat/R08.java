package java_repeat;

public class R08 {

	public static void main(String[] args) {
		
		// UvjetnoGrananjeSWITCH
		
		// U osnovi ako je operacija 1,2,3 ili 4 sve ok, u protivnom pi�i gre�ka
		
		int operacija=1;
		
		if (operacija==1) {
		
		} else if (operacija==2) {
		
		} else if (operacija==3) {
			
		} else if (operacija==4) {
			
		} else {
			System.out.println("Gre�ka");
		}
		
		// SWITCH radi s cijelim brojevima, char i STRING
		
		switch (operacija) {
		case 1:
			System.out.println("Zbrajanje");
			break;
		case 2:
			System.out.println("Oduzimanje");
			break;
		case 3:
			System.out.println("Mno�enje");
			break;
		case 4:
			System.out.println("Djeljenje");
			break;
		case 0:
		case 5:
			System.out.println("Skoro no ne valja");
			break;
			default:
				System.out.println("Gre�ka");
		}	
		
	}
	
}

		


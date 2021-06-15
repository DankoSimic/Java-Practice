package java_repeat;

import java.util.Arrays;

public class R10 {

	public static void main(String[] args) {
		
		int [][] tablica = new int [3][3];
		
		tablica [0][0] = 1;
		tablica [0][1] = 0;
		tablica [0][2] = 0;
		
		tablica [1][0] = 0;
		tablica [1][1] = 1;
		tablica [1][2] = 0;
		
		tablica [2][0] = 0;
		tablica [2][1] = 0;
		tablica [2][2] = 1;
		
		System.out.println(Arrays.toString(tablica));
		
		System.out.println(Arrays.toString(tablica [0]));
		System.out.println(Arrays.toString(tablica [1]));
		System.out.println(Arrays.toString(tablica [2]));
		
		int [][][] kocka = new int [10][10][10];
		
		int [][][][] kocka_u_vremenu = new int [10][10][10][10];
		
		int [][] podaci = {
				{1,1,2,3},
				{5,4,7,2},
				{3,4,5,6}
		};
		
		System.out.println(podaci[1][2]);

	}
	
}

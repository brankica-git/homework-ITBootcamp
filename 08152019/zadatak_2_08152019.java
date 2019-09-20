package aa;

import java.util.Scanner;

public class zadatak_2_08152019 {

	public static void main(String[] args) {
		// Napisati program koji ce ispisati n brojeva Fibonacijevog niza.
		// (Na internetu istraziti sta je Fibonacijev niz!!!)
		// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Uneti broj N");

		int n = sc.nextInt();
		
		int f1=0, f2=1, temp=0;
		
		if (n <= 0) {
			System.out.println("Pogresan unos.");
		} else if (n == 1) {
			System.out.println("0");
		} else if (n == 2) {
			System.out.println("0");
			System.out.println("1");
		} else {
			System.out.println("0");
			System.out.println("1");
			for(int i = 3; i <= n; i++) {
				temp = f1;
				f1 = f2;
				f2 = temp + f2;
				System.out.println(f2);
			}
		}
	}

}

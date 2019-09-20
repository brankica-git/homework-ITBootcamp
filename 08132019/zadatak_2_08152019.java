package cd;

import java.util.Scanner;

public class zadatak_2_08152019 {

	public static void main(String[] args) {
		// a) Napisati program koji ce sabrati brojeve od 1 do 5. Program treba da
		// ispise zbir.
		System.out.println("a)");

		int br = 1;
		int sum = 0;
		while (br <= 5) {
			sum = sum + br;
			br += 1;
		}
		System.out.println("Suma brojeva od 1 do 5 je " + sum);

		// b) Napisati program koji ce sabrati sve brojeve od 1 do n (n uneti preko
		// konzole). Program treba da ispise zbir.
		System.out.println("b)");
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite n");
		int n = sc.nextInt();
		int bro = 1;
		int suma = 0;
		while (bro <= n) {			
			suma = suma + bro;
			bro += 1;
		}
		System.out.println("Suma brojeva od 1 do " + n + " je " + suma);
		
		// c) Napisati program koji ce sabrati sve brojeve od k do n (k i m uneti preko
		// konzole). Program treba da ispise zbir.
		System.out.println("c)");
		System.out.println("Unesite k");
		int k = sc.nextInt();
		System.out.println("Unesite n");
		int m = sc.nextInt();
		int zbir = 0;
		while (k <= m) {			
			zbir = zbir + k;
			k += 1;
		}
		System.out.println("Suma brojeva od k do n je: " + zbir);
	}
}
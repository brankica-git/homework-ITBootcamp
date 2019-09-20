package devetidan;

import java.util.Scanner;

public class Zadatak_1_08232019 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ucitava ceo broj n. Taj broj n se prosledjuje metodi
		 * koja formira i vraca ceo broj koji predstavlja inverzan broj. Glavni program
		 * nakon toga ispisuje taj inverzan broj.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi n ");
		int n = sc.nextInt();
		n = inverzniBroj(n);
		System.out.print("Inverzni broj je: " +n);
		


	}
	public static int inverzniBroj(int n) {
		int m = 0;
		
		while (n != 0) {			
			int c = n % 10;		
			m = m * 10 + c;
			n = n / 10;
		}	
		
		return m;
	}

}

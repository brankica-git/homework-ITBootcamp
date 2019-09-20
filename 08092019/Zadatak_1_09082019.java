package dp;

import java.util.Scanner;

public class Zadatak_1_09082019 {

	public static void main(String[] args) {
		// Napisati program koji proverava da li je uneti broj paran ili neparan.
		// Ukoliko jeste, program treba da ispise poruku: Broj je paran!
		// Ukoliko nije, program treba da ispise poruku: Broj je neparan!
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Molim unesite prirodan broj za koji ce vam se vratiti da li je paran ili neparan");
		
		int a = sc.nextInt();
		
		// Negativni brojevi takodje mogu biti parni i neparni, proverila sam na Google-u
		if (a < 0) {
			a = a * -1;
		}
		
		// Ukoliko je ostatak pri deljenju sa 2 jednak nuli - to je paran broj
		// Ukoliko je ostatak pri deljenju sa 2 jednak jedinici - to je napran broj
		// U svakom drugom slucaju ispisi cudnu poruku
		if (a % 2 == 0) {
			System.out.println("Uneli ste paran broj");
		} else if (a % 2 == 1) {
			System.out.println("Uneli ste neparan broj");
		} else {
			System.out.println("Houston we have a problem!");
		}
		
		sc.close();
	}
	
}

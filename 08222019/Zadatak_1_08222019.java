package novoVezbanje;

import java.util.Scanner;

public class Zadatak_1_08222019 {

	public static void main(String[] args) {
		/*
		 * Napisati program u kom se unose 3 realna broja i poziva i ispisuje dve metode
		 * (u mainu). Prva metoda vraca proizvod unetih brojeva. Druga metoda ispisuje
		 * najmanji od unesenih brojeva.
		 */

		Scanner sc = new Scanner(System.in);
		double a, b, c;

		System.out.println("unesi broj a");
		a = sc.nextDouble();
		System.out.println("unesi broj b");
		b = sc.nextDouble();
		System.out.println("unesi broj c");
		c = sc.nextDouble();
		System.out.println(proizvod(a, b, c));
		System.out.println("Najmanji je: " + najmanji(a, b, c));
	}

	public static double proizvod(double x, double y, double z) {
		double sum = x * y * z;
		return sum;

	}

	public static double najmanji(double a, double b, double c) {
		double min = 0;
		if (a < b) {
			if (a < c) {
				min = a;
			}
		}

		if (b < c) {
			if (b < a) {
				min = b;
			}
		}

		if (c < a) {
			if (c < b) {
				min = c;
			}
		}
		return min;
	}

}

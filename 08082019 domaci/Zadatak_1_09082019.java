package pp;

import java.util.Scanner;

public class Zadatak_1_09082019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, o, p;
		System.out.println("Učitaj a: ");
		System.out.println("Učitaj b: ");
		a=sc.nextInt();
		b=sc.nextInt();
		o=2*a+2*b;
		p=a*b;
		System.out.println("Obim je: " +o);
		System.out.println("Površina je: "+p);
	}

}

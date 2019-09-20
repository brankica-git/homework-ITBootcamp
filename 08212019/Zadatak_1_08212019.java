package sedmdan;

import java.util.Scanner;

public class Zadatak_1_08212019 {

	public static void main(String[] args) {
		/*
		 * Korisnik ucitava niz od n elemenata niza, kao i neki broj br.
		 *  Program ispisuje elemente niza deljive brojem br.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi broj elemenata niza N");
		int n = sc.nextInt();
		System.out.println("Unesi br");
		int broj = sc.nextInt();
		int [] niz = new int [n];
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesi element niza");
			niz[i] = sc.nextInt();
		}
		System.out.println("Niz uspesno unesen");
		for (int i = 0; i < niz.length; i++) {
			int g = niz[i];
			if (g % broj == 0) {
				System.out.print(niz[i]);	
			}
		}
	}

}

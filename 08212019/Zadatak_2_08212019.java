package sedmdan;

import java.util.Scanner;

public class Zadatak_2_08212019 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ucitava duzinu niza, niz i ispisuje niz inverznim
		 * redosledom. 
		 * Primer niza: 3 54 123 18
		 *      Ispis: 18 123 54 32
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi duzinu niza N");
		int n = sc.nextInt();
		
		int [] niz = new int [n];
		for(int i = 0; i< niz.length; i++) {
			System.out.println("unesi elemente niza");
			niz [i] = sc.nextInt();
		}
		System.out.println("Niz uspesno unesen");
		for(int i = n-1; i >=0; i--) {
			System.out.print(niz[i] +" ");
		}	
	
		}
	}
	



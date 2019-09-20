package devetidan;

import java.util.Scanner;

public class Zadatak_3_08232019 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ucitava niz od n celih brojeva i dve metode. Prva
		 * metoda vraca proizvod elemenata na neparnim pozicijama, a druga vraca zbir
		 * parnih elemenata niza.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi n za duzinu niza");
		int n = sc.nextInt();
		int sum = 1;
		int[] niz = new int [n];
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesi " + i + ". element niza:");
			niz[i] = sc.nextInt();
		}
		sum = proizvodElementa(niz);
		System.out.println("Proizvod elemenata na neparnim pozicijama niza je: " + sum);
		sum = zbirParnihElemenata(niz);
		System.out.println("Zbir parnih elemenata niza je: " + sum);

	}
	
	public static int proizvodElementa(int[] arr) {
		int sum = 1;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 1) {
				sum = sum * arr[i];
			}			
		}
		return sum;
	}
	public static int zbirParnihElemenata(int[] arr) {
		int sum =0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				sum= sum + arr[i];
			}
		}
		return sum;
	}
	

}

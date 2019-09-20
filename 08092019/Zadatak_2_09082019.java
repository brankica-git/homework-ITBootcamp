package dp;

import java.util.Scanner;

public class Zadatak_2_09082019 {

	public static void main(String[] args) {
		// Napisati program koji u zavisnosti od unesenog stringa racuna povrsine kvadrata, kruga ili pravougaonika.
		// Ukoliko se unese “pravougaonik”	nek pita korisnika za 2 stranice i ispise povrsinu.
		// Ukoliko se unese “krug” nek pita korisnika za poluprecnik kruga i izracuna povrsinu. 
		// Ukoliko se unese “kvadrat” nek pita korisnika za unos stranice i izracuna povrsinu kvadrata.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite jedno od sledecih geometrijskih tela: pravougaonik, krug ili kvadrat:");
		
		String geometrijskoTelo = sc.nextLine();
		
		switch (geometrijskoTelo) {
			case "pravougaonik":
				double a, b;			
				System.out.println("Za racunanje povrsine pravougaonika potrebno je da unesete njegove dve stranice.");
				
				System.out.println("Unesite prvu stranicu vaseg pravougaonika:");
				a = sc.nextDouble();
				
				System.out.println("Unesite drugu stranicu vaseg pravougaonika:");			
				b = sc.nextDouble();
				
				System.out.println("Povrsina vaseg pravougaonika je: " + (a * b));
				break;
			case "krug":
				double r;
				System.out.println("Za racunanje povrsine kruga potrebno je da unesete njegov poluprecnik.");
				
				System.out.println("Unesite poluprecnik vaseg kruga:");			
				r = sc.nextDouble();			
				
				System.out.println("Povrsina vaseg kruga je: " + Math.PI * (r * r));
				break;
			case "kvadrat":
				double x;
				System.out.println("Za racunanje povrsine kvadrata potrebno je da unesete jednu njegovu stranicu.");
				
				System.out.println("Unesite stranicu vaseg kvadrata:");			
				x = sc.nextDouble();
				
				System.out.println("Povrsina vaseg kvadrata je: " + (x * x));
				break;
			default:
				System.out.println("Neispravan unos");
				break;
		}
		
		System.out.println("\nHvala sto koristite nasu aplikaciju.");
		
		sc.close();
	}

}

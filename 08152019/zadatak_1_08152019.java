package aa;

import java.util.Scanner;

public class zadatak_1_08152019 {

	public static void main(String[] args) {
		// Napisati program - meni - za izracunavanje i ispis povrsina geometrijskih tela
		// (kocke, kvadra, valjka, lopte).
		// Koristiti do while petlju i switch grananje.
		// Za izlaz koristiti nulu (0).
		
		Scanner sc = new Scanner(System.in);
		int izbor;

		do {
			System.out.println("");
			System.out.println("1 - Povrsina kocke");
			System.out.println("2 - Povrsina kvadra");
			System.out.println("3 - Povrsina valjka");
			System.out.println("4 - Povrsina lopte");
			System.out.println("0 - Izlaz");
			izbor = sc.nextInt();
			
			switch (izbor) {
				case 1: // kocka
					System.out.println("Unesite stranicu kocke");
					double stranicaKocke = sc.nextDouble();
					// P = 6 * a * a
					System.out.println("Povrsina kocke je: " + 6 * stranicaKocke * stranicaKocke);
					break;
				case 2: // kvadar
					System.out.println("Unesite prvu stranicu kvadra");
					double a = sc.nextDouble();
					System.out.println("Unesite drugu stranicu kvadra");
					double b = sc.nextDouble();
					System.out.println("Unesite trecu stranicu kvadra");
					double c = sc.nextDouble();
					// P = 2 * (a * b + a * c + b * c)
					System.out.println("Povrsina kvadra je: " + 2 * (a * b + a * c + b * c));
					break;
				case 3: // valjak
					System.out.println("Unesite visinu valjka");
					double H = sc.nextDouble();
					System.out.println("Unesite poluprecnik valjka");
					double r = sc.nextDouble();
					// P = 2 * r * pi * (r + H)
					System.out.println("Povrsina valjka je: " + 2 * r * Math.PI * (r + H));
					break;
				case 4: // lopta
					System.out.println("Unesi poluprecnik lopte");
					double R = sc.nextDouble();
					// P = 4 * r * r * pi
					System.out.println("Povrsina lopte je: " + 4 * R * R * Math.PI);
					break;
				case 0:
					System.out.println("Hvala na poseti.");
					break;
				default:
					System.out.println("Pogresan unos!");
					break;
			}
			
		} while (izbor != 0);
	}

}

package aa;

import java.util.Scanner;

public class zadatak_1_08162019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int izbor;

		do {
			System.out.println("");
			System.out.println("1 - IF-ELSE zadatak");
			System.out.println("2 - WIHLE zadatak");
			System.out.println("3 - FOR zadatak");
			System.out.println("0 - Izlaz");
			izbor = sc.nextInt();
			
			switch (izbor) {
				case 1:
					System.out.println("IF-ELSE Zadatak:");
					System.out.println("82	Učitati radijus. Ako je veći od 5 izračunati obim kruga inače izračunati površinu kruga.");
					System.out.println("Unesite radijus (poluprečnik) kruga");
					double r = sc.nextDouble();
					if (r > 5) {
						System.out.println("Radijus je veci od 5. Računam obim kruga.");
						System.out.println("Obim kruga je " + 2 * r * Math.PI);
					} else {
						System.out.println("Radijus je manji (ili jednak) od 5. Računam površinu kruga.");
						System.out.println("Površina kruga je " + r * r * Math.PI);						
					}
					break;
				case 2:
					System.out.println("WHILE Zadatak:");
					System.out.println("71_2	Ispisati prvih a parnih prirodnih brojeva.");
					System.out.println("Unesite broj a");
					int a = sc.nextInt();
					int br = 1;
					int pom = 0;
					while (pom < a) {
						if (br % 2 == 0) {
							System.out.print(br + ", ");
							pom += 1;
						}
						br += 1;
					}					
					break;
				case 3:
					System.out.println("FOR Zadatak:");
					System.out.println("90_13	Napisati program za ispis trougla kao na slici (piramida) sa željenim brojem redova:");
					System.out.println("Unesite zeljeni broj redova");
					int x = sc.nextInt();
					for (int i = 0; i < x; i++) {
						for (int j = x - i; j > 1; j--) { 
			                System.out.print(" "); 
			            }
			            for (int j = 0; j <= i; j++) {
			                System.out.print("* "); 
			            } 
						System.out.println("");
					}					
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

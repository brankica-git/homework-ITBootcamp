package aa;

import java.util.Scanner;

public class zadatak_3_08152019 {

	public static void main(String[] args) {
		// Napravi program koji ce na izlazu izbaciti sliku pravougaonika od zvezdica:
		// Primer:
		// ulaz
		// int m=7, n=3;
		// Izlaz                 
		//  *	*	*	*	*	*	*
		//  *	*	*	*	*	*	*
		//  *	*	*	*	*	*	*
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Uesite broj kolona");
		int m = sc.nextInt();
		
		System.out.println("Uesite broj redova");
		int n = sc.nextInt();
		
		System.out.println("Vasa tabela sa zvezdicama:");
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("*\t");
			}
			System.out.print("\n");
		}


	}

}

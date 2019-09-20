package devetidan;

import java.util.Scanner;

public class Zadatak_2_08232019 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ucitava tri cela broja i metodu koja ispisuje brojeve
		 * od prvog do drugog (ukljucujuci i njih) koji su deljivi trecim
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Uneti tri broja k, n, m");
		int k = sc.nextInt();
		int n = sc.nextInt();
		int m = sc.nextInt();
		k= niz(k, n, m);
	

	}

	public static int niz(int k, int n, int m) {
	
		while (k <= n) {

			if (k % m == 0) {
				System.out.println(k);
			}

			k = k + 1;
		}
		
		return k;
	}

}

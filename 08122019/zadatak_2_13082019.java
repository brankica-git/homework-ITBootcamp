package tri;

import java.util.Scanner;

public class zadatak_2_13082019 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji racuna sumu parnih brojeva i proizvod neparnih brojeva
		 * od 0 do n. Koristiti jednu petlju.
		 */
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int zbirParnih = 0;
		int proizvodNeparnih = 1;
		int br = 0;
		while (br < n) {
			if (br % 2 == 0) {
				zbirParnih = zbirParnih + br;
				br = br + 1;
			} else if (br % 2 == 1) {
				proizvodNeparnih = proizvodNeparnih * br;
				br = br + 1;
			}

		}
		System.out.println(zbirParnih);
		System.out.println(proizvodNeparnih);
	}

}

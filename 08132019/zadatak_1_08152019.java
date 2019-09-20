package cd;

public class zadatak_1_08152019 {

	public static void main(String[] args) {
		int i = 3, j = 5;

		j = ++i;
		System.out.println(j);
		// j = 4 odmah se vrednost povecava za 1
		
		i = 3;
		j = ++i + ++i;
		System.out.println(j);
		// j = 4 + 5 = 9 odmah se vrednost povećava za jedan i sabira se sa vrednošću koja se isto poveća za jedan
		
		i = 3;
		j = i++;
		System.out.println(j);
		// j = 3 prvo se uzima vrednost i, smešta se u j pa se tek nakon toga vrednost i poveća za 1
		
		i = 3;
		j = i++ + i++;
		System.out.println(j);
		// j = 3 + 4 = 7 prvo se uzima vrednost i pa se zatim poveca za jedan pa se tako povecana sabere i dodeli j
		
		i = 3;
		j = --i;
		System.out.println(j);
		// j = 2 odmah se vrednost i umanji za jedan i dodeli j
		
		i = 3;
		j = --i + --i;
		System.out.println(j);
		// j = 2 + 1 = 3 prvo se vrednost i umanji za jedan i sabere sa novim i koje se isto prvo umanji za jedan pa se ukupni zbir dodeli promenljivoj j
		
		i = 3;
		j = i--;
		System.out.println(j);
		// j = 3 vrednost i se dodeli promenljivoj j a zatim se umanji za jedan.
		
		i = 3;
		j = i-- + i--;
		System.out.println(j);
        // j = 3 + 2 = 5 uzima se originalna vrednost i, pa se sabere sa umanjenom vrednosti i. Rezultat se dodeli j.		
	}

}

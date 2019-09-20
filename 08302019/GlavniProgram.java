package domaciPetak;

public class GlavniProgram {

	public static void main(String[] args) {
		Njiva n = new Njiva(500, 200);
		Njiva n1 = new Njiva(600, 300);
		Suma s = new Suma(600, 500, 300, 3);
		Suma s1 = new Suma(300, 150, 50, 2);
		Parcela [] niz2 = new Parcela [10];
		Parcela[]niz= {n, n1,s, s1};
		for (int i=0; i<niz.length; i++) {
			System.out.println(niz[i]);
		}
		
	}
		

}


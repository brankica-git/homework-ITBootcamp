package fakultet3;

public class GlavniProgram {

	public static void main(String[] args) {
		Student s1=new Student("Pera Peric", 1999, "000123", 3, 9.99);
		System.out.println(s1.ispisi());
		Student s2=new Student("Merima Meric", 2000, "000124", 2, 7.99);
		System.out.println(s2.ispisi());
		Student s3=new Student("Ana Despota", 1989, "000125", 1, 8.99);
		System.out.println(s3.ispisi());
		
		Profesor p1= new Profesor("Marko Markovic",1956, "profdr");
		
		
		
		p1.dodajPredmet("matematika");
		p1.dodajPredmet("aritmetika");
		p1.dodajPredmet("fizika");
		System.out.println(p1.ispisi());
		Profesor p2= new Profesor("Mira Markovic",1964, "akademik");
		
		p2.dodajPredmet("geometrija");
		p2.dodajPredmet("statika");
		System.out.println(p2.ispisi());
	}

}

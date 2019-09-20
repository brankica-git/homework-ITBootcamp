package knjige;

public class GlavniKnjige {

	

	public static void main(String[] args) {
		
		Knjige prva = new Knjige  ("Leto", "Pera Peric", 123);
		Knjige druga = new Knjige  ("Prolece", "Mika Mikic", 101);
		Knjige treca = new Knjige  ("Zima", "Sofija Anic", 50);
		prva.setGodIzdanja(1875);
		druga.setGodIzdanja(2000);
		treca.setGodIzdanja(1999);
		

		System.out.println(prva.getNaziv()+ ", "+prva.getAutor()+ ", "+ prva.getBrojStrana()+ ", " +1875);
		System.out.println(druga.getNaziv()+ ", "+druga.getAutor()+ ", "+ druga.getBrojStrana()+ ", " +2000);
		System.out.println(treca.getNaziv()+ ", "+treca.getAutor()+ ", "+ treca.getBrojStrana()+ ", " +1999);
	}

}

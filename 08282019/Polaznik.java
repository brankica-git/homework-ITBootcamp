package ucionica;

public class Polaznik {
	/*
	 * Napraviti paket ucionica. Unutar paketa ucionica, pisati klase.
	 * 
	 * Polaznik ima ime i prezime koje se zadaje prilikom kreiranja polaznika.
	 * Polaznik poseduje i identifikacioni broj koji se moze dohvatiti. Ime i
	 * prezime polaznika se moze dohvatiti ali ne i postaviti. Vozac se ispisuje u
	 * obliku: IME_PREZIME{ID}.
	 * 
	 * Laptop poseduje polaznika i marku koji se zadaju prilikom kreiranja. Marka
	 * moze samo da se dohvati. Laptop takdje moze da menja polaznika ili da ostane
	 * bez polaznika. Moze da se ispise u obliku: MARKA{POLAZNIK}
	 */
	private static int UID=0;
	private String naziv;//get
	private int id;//get
	public Polaznik(String naziv) {
		this.naziv=naziv;
		id=++UID;
	}
	public int getId() {
		return id;
	}
	public static int getUID() {
		return UID;
		
	}
	public String getNaziv() {
		return naziv;
	}
	public String ispisi() {
		return naziv +"{"+id+"}";
	}

}

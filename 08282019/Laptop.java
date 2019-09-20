package ucionica;

public class Laptop {
	/*
	 * Napraviti paket ucionica. Unutar paketa ucionica, pisati klase.
	 * 
	 * Polaznik ima ime i prezime koje se zadaje prilikom kreiranja polaznika.
	 * Polaznik poseduje i identifikacioni broj koji se moze dohvatiti. Ime i
	 * prezime polaznika se moze dohvatiti ali ne i postaviti. Vozac se ispisuje u
	 * obliku: IME_PREZIME{ID}.
	 * 
	 * Laptop poseduje polaznika i marku koji se zadaju prilikom kreiranja. Marka
	 * moze samo da se dohvati. Laptop takodje moze da menja polaznika ili da ostane
	 * bez polaznika. Moze da se ispise u obliku: MARKA{POLAZNIK}
	 */
	private Polaznik polaznik;//get,set, ukloni
	private String marka;// get


	public Laptop(String marka) {
		this.marka=marka;
		polaznik=null;
	}
	public Polaznik getPolaznik() {
		return polaznik;
	}
	public void setPolaznik(Polaznik polaznik) {
		this.polaznik=polaznik;
	}
	public void resetPolaznik() {
		polaznik=null;
	}
	public String ispisi() {
		String s;
		if(polaznik==null) {
			s="nema polaznika";
		}else s=polaznik.ispisi();
		return marka+ "{"+polaznik+"}"+s;
	}
}

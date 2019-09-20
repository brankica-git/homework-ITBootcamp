package knjige;

public class Knjige {
	/*
	 * Napisati klasu Knjige koja ima sledeca polja: naziv knjige, autora, broj
	 * strana, godinu izdanja. Sva polja mogu da se dohvate, a godina izdanja moze i
	 * da se postavi. Napisati glavni program koji kreira tri knjige i ispisuje sve
	 * njihove podatke.
	 */
	private String naziv;
	private String autor;
	private int brojStrana;
	private int godIzdanja;
	
	public Knjige (String naziv, String autor, int brojStrana) {
		this.naziv=naziv;
		this.autor=autor;
		this.brojStrana=brojStrana;
		
	}
	public String getNaziv() {
		return naziv;
	}
	public String getAutor() {
		return autor;
	}
	public int getBrojStrana() {
		return brojStrana;
	}
	public int getGodIzdanja() {
		return godIzdanja;
	}
	public void setGodIzdanja(int godIzdanja) {
		this.godIzdanja=godIzdanja;
	}
}

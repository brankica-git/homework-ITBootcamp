package fakultet3;

public class Covek {
	/*
	 * Covek ima ime, prezime i godinu rodjenja. Ime i prezime mogu da se i dohvate
	 * i postave, dok godina rodjenja moze samo da se dohvati. Coveka ispisati u
	 * formatu: Ime_Prezime[godina rodjenja]. 
	 * 
	 * Student je covek koji se kreira sa
	 * brojem indeksa i ima trenutnu godinu studija i trenutni prosek. Sva polja
	 * mogu samo da se dohvate. Studenta ispisati u formatu: Ime_Prezime[godina
	 * rodjenja] je student ___ (god studija) godine studija sa prosekom____
	 * (trenutni prosek). 
	 * 
	 * Profesor je covek koji ima titulu i listu predmeta na
	 * kojima drzi nastavu. Predmeti mogu da se dodaju i oduzimaju iz liste.
	 * Profesora ispisati u formatu: Ime_Prezime[godina rodjenja] je ___(titula)
	 * koji drzi nastavu na: <lista predmeta>.
	 * 
	 * Napisati glavni program koji ce imati bar tri studenta i dva profesora.
	 * 
	 */
	private String naziv;//get, set
	private int godRodj;//get
	
	public Covek (String naziv, int godRodj) {
		this.naziv=naziv;
		this.godRodj=godRodj;
		
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String ispisi() {
		return naziv + "["+godRodj+"]";
	}
	public int getGodRodj() {
		return godRodj;
	}
	
	
}


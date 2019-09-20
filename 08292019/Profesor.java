package fakultet3;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Covek{
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
	private String titula;
	private ArrayList<String> predmeti;
	
	public Profesor(String naziv, int godRodj, String titula) {
		super(naziv, godRodj);
		this.titula = titula;
		this.predmeti = new ArrayList<String>();
		
	}
	public void dodajPredmet(String predmet) {
		this.predmeti.add(predmet);
	}
	public void ukloniPredmet(String predmet) {
		this.predmeti.remove(predmet);
	}
	public String ispisi() {
	String p = "";
	for(int i =0; i<predmeti.size(); i++) {
		p=p+ " " +predmeti.get(i);
	}
	return super.ispisi() + "je" + 	this.titula + "koji drzi nastavu na: " +p;
	}

	
}

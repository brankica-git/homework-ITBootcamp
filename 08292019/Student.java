package fakultet3;

public class Student extends Covek{
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
	private String brIndeksa;//get
	private int godStuduja;//get
	private double prosek; //get
	
	public Student(String naziv, int godRodj, String brIndexa, int godStudija, double prosek) {
		super(naziv, godRodj);
		this.brIndeksa=brIndeksa;
		this.godStuduja=godStuduja;
		this.prosek=prosek;
	}

	public String getBrIndeksa() {
		return brIndeksa;
	}

	public int getGodStuduja() {
		return godStuduja;
	}

	public double getProsek() {
		return prosek;
	}
	public String ispisi () {
		return super.ispisi()+"je student" +godStuduja+ "godine studija"+ "sa prosekom"+prosek;
	}
	
}

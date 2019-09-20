package ucionica;

public class Glavni_program {

	public static void main(String[] args) {
		Polaznik p1= new Polaznik("Milica Nedic");
		Laptop l1 = new Laptop ("lenovo");
		p1.getId();
		l1.setPolaznik(p1);
		System.out.println(p1.ispisi());
		System.out.println(l1.ispisi());
		l1.resetPolaznik();
		System.out.println(l1.ispisi());

	}

}

package domaciPetak;

public abstract class Parcela {
	protected double povrsina; //u kvadratnim metrima prilikom kreiranja.
	private static int UID=0;
	private int id;
	protected char oznaka;
	
	public Parcela(double povrsina) {
		this.povrsina=povrsina;
		this.id=++UID;
		
	}
	public double getPovrsina() {
		return povrsina;
	}

	public  char getOznaka() {
		return oznaka;
	}
	public abstract double getPrinos(int godine);
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
	    sb.append(oznaka+"-"+id+"["+povrsina+"]");
	    return sb.toString();
	}
	
}

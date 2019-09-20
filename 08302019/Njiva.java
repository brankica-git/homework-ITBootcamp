package domaciPetak;

public class Njiva extends Parcela {
	private double prinosPoKv;
	

	public Njiva(double povrsina, double prinosPoKv) {
		super(povrsina);
		this.oznaka='N';
		this.prinosPoKv=prinosPoKv;
	}

	@Override
	public double getPrinos(int godine) {
		return povrsina*prinosPoKv;
		
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString()+":"+ prinosPoKv);
		return sb.toString();
	}

}


package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetpotion = 1;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getEffetpotion() {
		return effetpotion;
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetpotion=" + effetpotion + "]";
	}
	
	public static void main(String[] args) {
		
	}
}

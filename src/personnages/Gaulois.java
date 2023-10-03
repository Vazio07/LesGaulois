package personnages;

import java.util.Random;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getForce() {
		return force;
	}
	
	public void setForce(int force) {
		this.force = force;
	}
	
	public int getEffetPotion() {
		return effetPotion;
	}
	
	public void setEffetPotion(int effetPotion) {
		this.effetPotion = effetPotion;
	}
	
	public void boirePotion(int forcePotion) {
		this.effetPotion=forcePotion;
		parler("Merci Druide, je sens que ma force est " + forcePotion + " fois décuplée");
	}

	public void frapper(Romain romain) {
		System.out.println(nom + "envoie un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup((force/3)*effetPotion);
	}
	
	public String prendreParole() {
		return "Le Gaulois " + nom + ":" ;
	}
	
	public void parler (String texte) {
		System.out.println(prendreParole() + "�" + texte + "�");
	}
	
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public static void main(String[] args) {
		Gaulois asterix;
		asterix = new Gaulois("Asterix",8);
		System.out.println(asterix);
		asterix.parler("Bonjour � tous");
		asterix.boirePotion(5);
	}
}

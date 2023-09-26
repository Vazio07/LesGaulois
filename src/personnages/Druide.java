package personnages;

import java.util.Random;

public class Druide {
	
	private String nom;
	private int forcePotion = 1;
	private int effetPotionMin;
	private int effetPotionMax;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
	}
	
	public String getNom() {
		return nom;
	}
	
	
	public void preparerPotion() {
		Random random = new Random();
		forcePotion = random.nextInt(effetPotionMin , effetPotionMax);
		if (forcePotion > 7) {
			parler("J'ai préparé une super potion de force");
		}else{
			parler("«Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force "+forcePotion);
		}
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "«" + texte + "»");
	}
	
	private String prendreParole() {
		return "Le Druide " + nom + ":";	
	}
	
	public static void main(String[] args) {
		Druide panoramix;
		panoramix = new Druide("Panoramix",5,10);
		panoramix.preparerPotion();
	}
}

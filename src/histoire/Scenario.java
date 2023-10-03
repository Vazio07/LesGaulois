package histoire;

import personnages.Gaulois;
import personnages.Druide;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix;
		asterix = new Gaulois("Asterix",8);
		Gaulois obelix;
		obelix = new Gaulois("Obelix",25);
		Druide panoramix;
		panoramix = new Druide("Panoramix",5,10);
		Romain minus;
		minus = new Romain ("Minus",6);
		panoramix.parler("Bonjour, je suis le druide Panoramix et ma potion peut aller d'une force 5 à 10.");
		panoramix.parler("Je vais aller préparer une petite potion...");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		panoramix.booster(asterix);
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
	}

}

package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;
	
	public Romain(String nom,int force) {
		this.nom = nom;
		this.force = force;
		
		assert isInvariantSatisfied();
	}
	
	public String getNom() {
		return nom;
	}
	
	private String prendreParole() {
		return "Le romain " + nom + ":" ;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	
	public void recevoirCoup(int forceCoup) {
//		précondition
		assert force > 0;
		int avantforce = force;
		force -= forceCoup;
		if (force > 0) {
				parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
// post condition
		assert force < avantforce;
	}
	
	public void sEquiper(Equipement newEquipement) {
		switch (nbEquipement) {
		
		case 2: 
			System.out.println("Le soldat " + nom +" est déjà bien protégé !");
			break;
			
		case 1: 
			if (equipements[0]== newEquipement) {
				System.out.println("Le soldat " + nom + " possède déjà un " + newEquipement + ".");
			} else {
				ajouterEquipement(newEquipement);
			}
			break;
			
		case 0:
			ajouterEquipement(newEquipement);
		}
	}

	private void ajouterEquipement(Equipement newEquipement) {
		equipements[nbEquipement] = newEquipement;
		nbEquipement++;
		System.out.println("Le soldat " + nom + " s'équipe d'un " + newEquipement + ".");
	}
	
	private boolean isInvariantSatisfied() {
		return force > 0;
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		//System.out.println(Equipement.CASQUE);
		//System.out.println(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.BOUCLIER);
	}
	
}

package personnages;

public class Village {
	private Gaulois[] villageois;
	private Chef chef;
	private String nom;
	private int nbVillageois = 0;
	private int nbVillageoisMaximum;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximum];

	}

	public String getNom() {
		return nom;
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
		}
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;
	}
	
	public Gaulois trouverHabitant(int numVillageois) {
		return villageois[numVillageois];
	}
	
	public void afficherVillageois(){
		System.out.println("Dans village du chef " + chef.getNom() + " vivent les l�gendaires gaulois :");
		for(int numHabitant = 0; numHabitant < nbVillageois; numHabitant++)
		{
			System.out.println("- " + villageois[numHabitant].getNom());
		}
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irr�ductibles", 30);
//		Gaulois gaulois = village.trouverHabitant(30);
//		On obtient java.lang.ArrayIndexOutOfBoundsException parce que le maximum index de tableaux est �gal a 29.
		Chef chef = new Chef("Abraracourcix", 6, village);
		village.setChef(chef);
		
		Gaulois asterix = new Gaulois("Asterix", 8);
		village.ajouterHabitant(asterix);
//		Gaulois gaulois = village.trouverHabitant(1);
//		System.out.println(gaulois);
//		On obtient null dans le console parce que le nouveaux habitant asterix qui on a ajoute se trouve sur l'index 0 et pas 1.
		
		Gaulois obelix = new Gaulois("Ob�lix", 25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
	}
		

}

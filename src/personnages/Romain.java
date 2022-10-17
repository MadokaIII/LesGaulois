package personnages;

public class Romain {

	private String nom;
	private int force;
	private Equipement[] equipement = new Equipement[2];
	private int nbEquipement = 0;
    private String texte;

	public Romain(String nom, int force) {
		assert force >= 0;
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert force > 0;
		int var = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		assert var > force;
	}

	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 0:
			System.out.println("Le soldat " + nom + " s’équipe avec un " + equipement + " !");
			this.equipement[0] = equipement;
			nbEquipement++;
			break;

		case 1:
			if (this.equipement[0] == equipement) {
				System.out.println("Le soldat " + nom + " possède déjà " + equipement + " !");
			} 
			else {
				System.out.println("Le soldat Minus s’équipe avec un " + equipement + " !");
				this.equipement[1] = equipement;
				nbEquipement++;
			}
			break;

		case 2:
			System.out.println("Le soldat " + nom + " est déjà bien protégé !");
			break;
		}

	}
	
	

}
package personnages;

public class Gaulois {

	private String nom;
	private Equipement[] trophees = new Equipement[100];
	private int force;
	private int nbTrophees;
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public void setEffetPotion(int effetPotion) {
		this.effetPotion = effetPotion;
	}

	public int getEffetPotion() {
		return effetPotion;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + " »");
	}

//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
//		romain.recevoirCoup(force / 3 * effetPotion);
//	}

	public void boirePotion(int forcePotion) {
		setEffetPotion(forcePotion);
		parler("Merci Druide, je sens que ma force est " + forcePotion + " fois décuplée");
	}

	@Override
	public String toString() {
		return "Gaulois [nom = " + nom + ", force = " + force + ", effetPotion = " + effetPotion + "]";
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] nouveauTrophees = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; nouveauTrophees != null && i < nouveauTrophees.length; i++, nbTrophees++) {
			trophees[nbTrophees] = nouveauTrophees[i];
		}
	}
	
	public void faireUneDonnation(Musee musee) {
        if (nbTrophees == 0) {
            System.out.println(this.nom + "n'a pas d'équipement à donner ");
        } else {
            System.out.println("Le gaulois " + this.nom +" : « Je donne au musee tous mes trophees :");
            for(; nbTrophees > 0; nbTrophees--) {
                System.out.println("  - " + trophees[nbTrophees - 1].getNom());
                Trophee trophee = new Trophee(this, trophees[nbTrophees - 1]);
                musee.donnerTrophees(this, trophee);
                nbTrophees--;
            }
        }
    }

}

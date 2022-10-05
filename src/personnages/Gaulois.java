package personnages;

public class Gaulois {

	private String nom;
	private int force;
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom(){
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

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup(force / 3 * effetPotion);
	}
	
	public void boirePotion(int forcePotion) {
		setEffetPotion(forcePotion);
		this.parler("Merci Druide, je sens que ma force est " + forcePotion + " fois décuplée");
	}

	@Override
	public String toString() {
		return "Gaulois [nom = " + nom + ", force = " + force + ", effetPotion = " + effetPotion + "]";
	}
	
}

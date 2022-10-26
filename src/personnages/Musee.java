package personnages;

public class Musee {
	
	static Trophee[] collection = new Trophee[200];
	int nbTrophee = 0;
	
	public void donnerTrophees(Gaulois gaulois, Equipement equipement) {
        if (nbTrophee >= 200) {
            throw new IllegalArgumentException("Musee complet, trophee rejeté :" + equipement.getNom());
        } else {
            Trophee trophee = new Trophee(gaulois, equipement);
            collection[nbTrophee] = trophee;
            nbTrophee++;
//            System.out.println(gaulois.getNom() + "vient d'ajouter le trophee " + equipement.getNom() + " au musee.\n");
        }
    }

}

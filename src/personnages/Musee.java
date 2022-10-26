package personnages;

public class Musee {
	
	Trophee[] collection = new Trophee[200];
	int nbTrophee = 0;
	
	public void donnerTrophees(Gaulois gaulois, Trophee trophee) {
        if (nbTrophee >= 200) {
            throw new IllegalArgumentException("Musee complet, trophee rejeté :" + trophee.getEquipement());
        } else {
        	collection[nbTrophee] = trophee;
            nbTrophee++;
//            System.out.println(gaulois.getNom() + "vient d'ajouter le trophee " + equipement.getNom() + " au musee.\n");
        }
    }

}

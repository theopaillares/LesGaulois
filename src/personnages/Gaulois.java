package personnages;

import java.lang.reflect.Method;
import java.security.PublicKey;

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
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
	
	private String prendreParole() {
		// TODO Auto-generated method stub
		return "Le Gaulois " + nom + " : ";
	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup (force / 3);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	public void boirePotion() {
		
		parler("Merci Druide, je sens que ma force est "+  + " fois d�cupl�e");
	}
	
	public static void main(String[] args) {
		Gaulois asterix;
		asterix = new Gaulois("asterix", 8);
		System.out.println(asterix.getNom());
		System.out.println(asterix);
		asterix.prendreParole();
		asterix.parler("Bonjour");
		asterix.frapper(null);
	}
}


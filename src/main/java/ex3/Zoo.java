package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe d'un zoo qui gère des animaux
 */
public class Zoo {

	private String nom;
	private List<String> types = new ArrayList<String>();
	private List<String> noms = new ArrayList<String>();
	private List<String> comportements = new ArrayList<String>();
	
	public Zoo(String nom){
		this.nom = nom;
	}

	/**
	 * Méthode qui permet d'ajouter un animal à nos listes
	 * @param animal
	 */
	public void addAnimal(Animal animal){
		types.add(animal.getTypeAnimal());
		noms.add(animal.getNomAnimal());
		comportements.add(animal.getComportement());
	}

	/**
	 * Méthode qui permet d'afficher la liste de tous les animaux de notre zoo
	 */
	public void afficherListeAnimaux(){
		for (int i=0; i<types.size(); i++) {
			System.out.println(noms.get(i)+" "+types.get(i)+" "+comportements.get(i));
		}
	}

	/**
	 * Accesseur taille de notre zoo
	 * @return nombre animaux
	 */
	public int taille() {
		return types.size();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}

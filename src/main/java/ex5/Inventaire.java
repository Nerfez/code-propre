package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

	private List<Caisse> caisses;

	public Inventaire() {
		caisses = new ArrayList<>();
		caisses.add(new Caisse("Petits objets"));
		caisses.add(new Caisse("Moyens objets"));
		caisses.add(new Caisse("Grands objets"));
	}

	/**
	 * Ajout d'un item à mes caisses
	 * @param item
	 */
	public void addItem(Item item) {

		for ( Caisse listeCaisse : caisses)
		{
			listeCaisse.getItems().add(item);
		}
	}

	/**
	 * Retourne le nombre d'items de toutes mes caisses
	 * @return int
	 */
	public int taille() {
		int maTaille = 0;
		for ( Caisse listeCaisse : caisses)
		{
			maTaille += listeCaisse.getItems().size();
		}
		return maTaille;
	}
}

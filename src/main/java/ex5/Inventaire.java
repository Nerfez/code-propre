package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

	private List<Caisse> caisses;

	public Inventaire() {
		caisses = new ArrayList<>();
		caisses.add(new Caisse("Petits objets",1,5));
		caisses.add(new Caisse("Moyens objets",5,16));
		caisses.add(new Caisse("Grands objets",20,30));
	}

	/**
	 * Ajout d'un item à mes caisses
	 * @param item
	 */
	public void addItem(Item item) {

		for ( Caisse listeCaisse : caisses)
		{
			if (listeCaisse.isPoidsValid(item))
			{
				listeCaisse.getItems().add(item);
			}
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

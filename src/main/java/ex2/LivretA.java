package ex2;

/**
 * Représente un compte bancaire de type compte Livret A
 */
public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	/** Ce constructeur est utilisé pour créer un compte de type Livret A
	 * @param solde représente le solde du compte
	 * @param tauxRemuneration  représente le taux de rémunération du livret A
	 */
	public LivretA(double solde, double tauxRemuneration) {
		super(solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * Rémunération annuelle
	 */
	public void appliquerRemuAnnuelle(){
			this.setSolde(getSolde() + getSolde()*getTauxRemuneration()/100);
	}

	/** Ajoute un montant au solde
	 * @param montant
	 */
	@Override
	public void debiterMontant(double montant) {
		if (getSolde() - montant > 0){
			this.setSolde(getSolde() - montant);
		}
	}

	/** Getter for tauxRemuneration
	 * @return double
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}

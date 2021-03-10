package fr.eni.javaee.chifoumi;

public class TirageNombre {
	
	/**
	 * Tirage d'un nombre au sort stocké dans l'objet TirageNombre avec le défault [0;10[
	 */
	public TirageNombre() {
		super();
		this.nouveauTirage(0, 10);
	}
	
	/**
	 * Tirage d'un nombre au sort stocké dans l'objet TirageNombre avec [0;max[
	 * @param max exclusive
	 */
	public TirageNombre(int max) {
		super();
		this.nouveauTirage(0, max);
	}
	
	/**
	 * Tirage d'un nombre au sort stocké dans l'objet TirageNombre avec [min;max[
	 * @param min inclusive
	 * @param max exclusive
	 */
	public TirageNombre(int min, int max) {
		super();
		this.nouveauTirage(min, max);
	}
	
	public void nouveauTirage(int min, int max) {
		if(min < max && min >= 0 && max > 0) {
			this.tirage = (int)(Math.random()*(max - min));
		} else {
			System.out.println("Erreur Tirage: mauvais paramètres. Le tirage n'a pas été modifié (valeur: " + this.tirage + ")");
		}
	}
	
	public int getTirage() {
		return this.tirage;
	}
	
	private int tirage = 0;
	
}

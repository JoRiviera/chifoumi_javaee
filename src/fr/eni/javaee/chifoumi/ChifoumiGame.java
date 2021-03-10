package fr.eni.javaee.chifoumi;


public class ChifoumiGame {
	
	
	public static String coupAleatoire() {
		if(instance == null) {
			instance = new ChifoumiGame();
		}
		if(coups == null) {
			coups = ChifoumiCoups.values();
		}
		return coups[new TirageNombre(0, coups.length).getTirage()].getCoup();
	}
	
	/**
	 * Retourne si a est gagnant contre b (1/0, -1 si egalité ou erreur) 
	 * @param a
	 * @param b
	 * @return 1 si a gagnant, 0 si a perdant, -1 sinon
	 */
	public static int gagnant(String a, String b) {
		if(a.equalsIgnoreCase(b)) {
			return DRAW;
		}
		if(instance == null) {
			instance = new ChifoumiGame();
		}
		if(coups == null) {
			coups = ChifoumiCoups.values();
		}
		for(ChifoumiCoups c : coups) {
			if( a.equalsIgnoreCase( c.getCoup() ) ){
				if(b.equalsIgnoreCase(c.getGagne() ) ) {
					return WIN; // Gagnant
				}
				if(b.equalsIgnoreCase(c.getPerd() ) ) {
					return LOOSE; // Perdant
				}
			}
		}
		return WRONG_MOVES;
	}
	
	private static ChifoumiGame instance = null;
	private static ChifoumiCoups[] coups = null;
	
	public static final int WIN = 1;
	public static final int LOOSE = 0;
	public static final int DRAW = -1;
	public static final int WRONG_MOVES = 42;
	
}

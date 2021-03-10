package fr.eni.javaee.chifoumi;

public enum ChifoumiCoups {
	CHI(ChifoumiCoups.chi, ChifoumiCoups.mi, ChifoumiCoups.fou),
	FOU(ChifoumiCoups.fou, ChifoumiCoups.chi, ChifoumiCoups.mi),
	MI(ChifoumiCoups.mi, ChifoumiCoups.fou, ChifoumiCoups.chi);
	
	ChifoumiCoups(String coup, String gagne, String perd) {
		this.coup = coup;
		this.gagne = gagne;
		this.perd = perd;
	}
	
	private final static String chi="chi";
	private final static String fou="fou";
	private final static String mi="mi";
	
	private String coup;
	private String gagne;
	private String perd;
	
	public String getCoup() {
		return coup;
	}
	public String getGagne() {
		return gagne;
	}
	public String getPerd() {
		return perd;
	}
	
	
}

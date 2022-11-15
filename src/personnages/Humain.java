package personnages;



public class Humain {
	private String nom;
	private String boisson_fav;
	private int argent;
	
	public Humain(String nom, String boisson_fav , int argent) {
		this.nom=nom;
		this.boisson_fav=boisson_fav;
		this.argent=argent;
		
	}
	
	public void direBonjour() {
		String texte="Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boisson_fav;
		parler(texte);
	}
	
	public void boire() {
		String texte= "Mmmm, un bon verre de "+ boisson_fav +" GLOUPS !";
			parler(texte);
	}
	
	public String acheter(String bien, int prix) {
		perdreArgent(prix);
		return bien;
	}
	
	
	//Setter
	public void gagnerArgent(int gain) {
		this.argent= argent+ gain;
	}
	
	public void perdreArgent(int perte) {
		this.argent= argent - perte;
	}
	
	private void parler(String texte) {
		System.out.println("("+nom+")- " + texte);
	}
	
	//Getter
	public int getArgent() {
		return argent;
	}
	
	//Getter
	public String getNom() {
		return nom;
	}
	
	//Getter
	public String getBoisson() {
		return boisson_fav;
	}
}
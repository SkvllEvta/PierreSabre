package personnages;



public class Humain {
	private String nom;
	private String boisson_fav;
	private int argent;
	
//	private String direBonjour() {
//		return "Bonjour ! Je m'appelle" + nom + "et j'aime boire du" + boisson_fav;
//	}
	
//	private String boire() {
//		return "Mmmm, un bon verre de"+ boisson_fav +"GLOUPS !";
//	}
	
	private String acheter(String bien, int prix) {
		argent=argent-prix;
		return bien;
	}
	
	private int gagnerArgent() {
		//TODO
		return argent;
	}
	
	private void perdreArgent() {
		//TODO
	}
	
	public void parler(String texte) {
		System.out.println(nom + "-" + texte);
	}
	
}

package histoire;
import personnages.*;


public class HistoireTP4 {
	
	public static void main(String[] args) {
		String item1="kombucha";
		int prix_item1= 12;
		String item2="jeu";
		int prix_item2=2;
		String item3="kimono";
		int prix_item3=50;
		Humain prof= new Humain("Prof","kombucha",54);
		prof.direBonjour();
		System.out.println("("+prof.getNom()+")- J'ai "+ prof.getArgent() +" sous. Je vais pouvoir m'offrir une boisson � " + prix_item1 + " sous");
		prof.acheter(item1,prix_item1);
		prof.boire();
		System.out.println("("+prof.getNom()+")- J'ai "+ prof.getArgent() +" sous. Je vais pouvoir m'offrir un " + item2 + " � "+prix_item2+" sous");
		prof.acheter(item2, prix_item2);
		System.out.println("("+prof.getNom()+")- Je n'ai plus que "+ prof.getArgent() +" sous. Je ne peux m�me pas m'offrir un "+item3+" � "+prix_item3+" sous.");
	}
	
	
	
	
}



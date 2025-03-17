//package exercice1;

public class Cowboy extends Humain{

	private int popularite;
	private String adjectif;
	
	public Cowboy(String nom) {
		super(nom);
		this.popularite = 0;
		this.adjectif = "vaillant";
	}
	
	public Cowboy(String nom, String adjectif) {
		super(nom);
		this.popularite = 0;
		this.adjectif = adjectif;
	}
	
	public void liberer(Dame dame) {
	        if (!dame.estLibre()) {
	            dame.seFaireLiberer(Cowboy.this);
	            popularite++;
	            parler("Ne vous inqui�tez pas, " + dame.quelEstTonNom() + ", vous �tes sauv�e !");
	        } else {
	            parler("Pas besoin de vous lib�rer, vous �tes d�j� libre !");
	        }
	    }
	
	 public void tirer(Brigand brigand) {
	        parler("Prends �a, rascal !");
	        parler("Le " + adjectif + " " + quelEstTonNom() + " tire sur " + brigand.quelEstTonNom() + ". PAN !");
	    }
	 
	 
	 public int getPopularite() {
		return popularite;
	}

	 
	public String getAdjectif() {
		return adjectif;
	}

	 
}

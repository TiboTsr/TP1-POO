package exercice1;

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
	            parler("Ne vous inquiétez pas, " + dame.quelEstTonNom() + ", vous êtes sauvée !");
	        } else {
	            parler("Pas besoin de vous libérer, vous êtes déjà libre !");
	        }
	    }
	
	 public void tirer(Brigand brigand) {
	        parler("Prends ça, rascal !");
	        parler("Le " + adjectif + " " + quelEstTonNom() + " tire sur " + brigand.quelEstTonNom() + ". PAN !");
	    }
	 
	 
	 public int getPopularite() {
		return popularite;
	}

	 
	public String getAdjectif() {
		return adjectif;
	}

	 
}

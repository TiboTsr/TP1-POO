package exercice1;

public class Cowboy extends Humain{

	public static final String BOISSON_COWBOY_DEFAUT = "whisky";
	
	private int popularite;
	private String adjectif;
	
	public Cowboy(String nom) {
		super(nom, BOISSON_COWBOY_DEFAUT);
		this.popularite = 0;
		this.adjectif = "vaillant";
	}
	
	public Cowboy(String nom, String  boissonFavorite ,String adjectif) {
		super(nom, boissonFavorite);
		this.popularite = 0;
		this.adjectif = adjectif;
	}
	
	public void liberer(Dame dame) {
	        if (!dame.estLibre()) {
	            dame.seFaireLiberer(Cowboy.this);
	            popularite++;
	            parler("Ne vous inquietez pas, " + dame.quelEstTonNom() + ", vous etes sauvee !");
	        } else {
	            parler("Pas besoin de vous liberer, vous etes deja libre !");
	        }
	    }
	
	 public void tirer(Brigand brigand) {
	        parler("Prends ca, rascal !");
	        parler("Le " + adjectif + " " + quelEstTonNom() + " tire sur " + brigand.quelEstTonNom() + ". PAN !");
	    }
	 
	 
	 @Override
	public void sePresenter() {
		// TODO Auto-generated method stub
		super.sePresenter();
		parler("Les gens disent que je suis " + adjectif + " !");
		parler("J'ai sauvé " + popularite + " dames");
	}

	public int getPopularite() {
		return popularite;
	}

	 
	public String getAdjectif() {
		return adjectif;
	}

	 
}
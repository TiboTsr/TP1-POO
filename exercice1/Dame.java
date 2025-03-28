package exercice1;

public class Dame extends Humain{

	public static final String BOISSON_DAME_DEFAUT = "lait";
	
	private String couleurRobe;
	private boolean estLibre;
	
	public Dame(String nom, String couleurRobe) {
		super(nom, BOISSON_DAME_DEFAUT); // Appelle le constructeur de Humain
		this.couleurRobe = couleurRobe;
		this.estLibre = true;
	}
	
	public Dame(String nom, String boissonFavorite, String couleurRobe) {
		super(nom, boissonFavorite); // Appelle le constructeur de Humain
		this.couleurRobe = couleurRobe;
		this.estLibre = true;
	}
	
	public void seFaireKidnapper(Brigand brigant) {
		if (estLibre) {
			estLibre = false;
			parler(quelEstTonNom() + " Hurle : AAAAAH ! Je suis enlevee par " + brigant.quelEstTonNom() + " !");
		}else {
			parler(quelEstTonNom() + " Je me suis deja fait enlever ");
		}
	}

	 public void seFaireLiberer(Cowboy cowboy) {
	        if (!estLibre) {
	            estLibre = true;
	            parler(" : Merci, " + cowboy.quelEstTonNom() + ", tu es mon heros !");
	        } else {
	            parler(" : Je suis deja libre !");
	        }
	    }
	
	
	 
	@Override
	public void sePresenter() {
		// TODO Auto-generated method stub
		super.sePresenter();
		parler("J'adore ma robe " + couleurRobe + " ! ");
	}

	@Override
	public String quelEstTonNom() {
		// TODO Auto-generated method stub
		return "Miss " + super.quelEstTonNom();
	}

	public String getCouleurRobe() {
		return couleurRobe;
	}

	public void changerCouleurRobe(String couleurRobe) {
		this.couleurRobe = couleurRobe;
		parler("Regardez ma nouvelle robe "+ getCouleurRobe());
	}

	public boolean estLibre() {
		return estLibre;
	}

}
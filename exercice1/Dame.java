package exercice1;

public class Dame extends Humain{

	private String couleurRobe;
	private boolean estLibre;
	
	public Dame(String nom, String couleurRobe) {
		super(nom); // Appelle le constructeur de Humain
		this.couleurRobe = couleurRobe;
		this.estLibre = true;
		
	}
	
	public void seFaireKidnapper(Brigand brigant) {
		if (estLibre) {
			estLibre = false;
			parler(quelEstTonNom() + " Hurle : AAAAAH ! Je suis enlevée par " + brigant.quelEstTonNom() + " !");
		}else {
			parler(quelEstTonNom() + " Je me suis déja fait enlever ");
		}
	}

	 public void seFaireLiberer(Cowboy cowboy) {
	        if (!estLibre) {
	            estLibre = true;
	            parler(" : Merci, " + cowboy.quelEstTonNom() + ", tu es mon héros !");
	        } else {
	            parler(" : Je suis déjà libre !");
	        }
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

package exercice1;

public class Humain {
	
	protected static final String BOISSON_PAR_DEFAUT = "eau";

	private String nom;
	private String boissonFavorite;
	
	//Constructeur pour initaliser le nom et la boisson
	public Humain(String nom) {
		this(nom, BOISSON_PAR_DEFAUT);
	}
	
	public Humain(String nom, String boissonFavorite) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite; 
	}
	
	//Methode pour parler
	public void parler(String texte) {
		System.out.println("(" + nom + ")" + " - " + texte);
	}
	
	public void choisirBoissonFavorite(String boissonFavorite) {
		this.boissonFavorite = boissonFavorite;
	}

	//Methode pour se pr�senter
	public void sePresenter() {
		parler("Bonjour je m'appelle " + quelEstTonNom() + " et ma boisson preferee est le/l' " + boissonFavorite);
	}
	
	//Methode boire
	public void boire() {
		parler("Ah ! un bon verre de/d' " + boissonFavorite + " ! HUMMM !");
	}
	
	public String quelEstTonNom() {
		return nom;
	}
	
	public String quelEstTaBoissonFavorite() {
		return boissonFavorite;
	}
}
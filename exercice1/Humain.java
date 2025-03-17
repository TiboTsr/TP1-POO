//package exercice1;

public class Humain {

	private String nom;
	private String boissonFavorite;
	
	//Constructeur pour initaliser le nom et la boisson
	public Humain(String nom) {
		this.nom = nom;
		this.boissonFavorite = "eau"; 
	}
	
	//Methode pour parler
	public void parler(String texte) {
		System.out.println(nom + " - " + texte);
	}
	
	public void choisirBoissonFavorite(String boissonFavorite) {
		this.boissonFavorite = boissonFavorite;
	}

	//Methode pour se pr�senter
	public void sePresenter() {
		parler("Bonjour je m'appelle " + nom + " et ma boisson pr�f�r�e est le/l' " + boissonFavorite);
	}
	
	//Methode boire
	public void boire() {
		System.out.println("Ah ! un bon verre de/d' " + boissonFavorite + " ! HUMMM !");
	}
	
	public String quelEstTonNom() {
		return nom;
	}
	
	public String quelEstTaBoissonFavorite() {
		return boissonFavorite;
	}
}

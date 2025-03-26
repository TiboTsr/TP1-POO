package exercice1;

public class Barman extends Humain{

	private String nomBar;
	
	public Barman(String nom) {
		super(nom, "vin");
		this.nomBar = "Chez " + nom;
	}
	
	public Barman(String nom, String nomBar) {
		super(nom, "vin");
		this.nomBar = nomBar;
	}

	@Override
	public void sePresenter() {
		// TODO Auto-generated method stub
		super.sePresenter();
		parler("Mon super bar s'appelle " + nomBar);
	}
	
	public void servir(Humain client) {
		parler("Tiens " + client.quelEstTonNom() + " voici un bon verre de " + client.quelEstTaBoissonFavorite());
		client.boire();
	}

	@Override
	public void parler(String texte) {
		// TODO Auto-generated method stub
		super.parler(texte + " coco.");
	}
	
	
	
	
}

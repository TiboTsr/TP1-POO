package exercice1;

public class Sherif extends Cowboy {
	
	private int brigandsCoffres;
	
	public Sherif(String nom) {
		super(nom);
		this.brigandsCoffres = 0;
	}
	
	public void coffrerBrigand(Brigand brigand) {
		if (!brigand.isEnPrison()) {
			parler("Au nom de la loi, je vous arr�te " + brigand.quelEstTonNom() + " !");
			brigand.estEmprisonnePar(this);
			brigandsCoffres++;
		} else {
			parler("Tant mieux, ce brigand est d�j� en prison.");
		}
	}
	
	public void rechercherBrigand(Brigand brigand) {
		System.out.println("Une affiche vient d'�tre placard�e dans la ville.");
		parler("OYEZ OYEZ BRAVE GENS !! " + brigand.getRecompense() + " � � la "
				+ "personne qui arr�tera " + brigand.quelEstTonNom() + " mort ou vif !");
	}

	@Override
	public void sePresenter() {
		super.sePresenter();
		parler("J'ai coffr� " + brigandsCoffres + " brigands !");
	}

	@Override
	public String quelEstTonNom() {
		return "Sh�rif " + super.quelEstTonNom();
	}
}

package exercice1;

public class Sherif extends Cowboy {
	
	private int brigandsCoffres;
	
	public Sherif(String nom) {
		super(nom);
		this.brigandsCoffres = 0;
	}
	
	public void coffrerBrigand(Brigand brigand) {
		if (!brigand.isEnPrison()) {
			parler("Au nom de la loi, je vous arrête " + brigand.quelEstTonNom() + " !");
			brigand.estEmprisonnePar(this);
			brigandsCoffres++;
		} else {
			parler("Tant mieux, ce brigand est déjà en prison.");
		}
	}
	
	public void rechercherBrigand(Brigand brigand) {
		System.out.println("Une affiche vient d'être placardée dans la ville.");
		parler("OYEZ OYEZ BRAVE GENS !! " + brigand.getRecompense() + " € à la "
				+ "personne qui arrêtera " + brigand.quelEstTonNom() + " mort ou vif !");
	}

	@Override
	public void sePresenter() {
		super.sePresenter();
		parler("J'ai coffré " + brigandsCoffres + " brigands !");
	}

	@Override
	public String quelEstTonNom() {
		return "Shérif " + super.quelEstTonNom();
	}
}

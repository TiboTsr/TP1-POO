package exercice1;

public class Brigand extends Humain {

	public static final String BOISSON_BRIGAND_DEFAUT = "tord-boyaux";
	
	private String look;
	private int nbDamesEnlevees;
	private boolean enPrison;
	
	public Brigand(String nom) {
		super(nom, BOISSON_BRIGAND_DEFAUT);
		this.look = "mechant";
		this.nbDamesEnlevees = 0;
		this.enPrison = false;
	}
	
	public Brigand(String nom, String boissonFavorite, String look){
		super(nom, boissonFavorite);
		this.look = look;
		this.nbDamesEnlevees = 0;
		this.enPrison = false;
	}
	

	public void kidnapper(Dame dame){
		if (!enPrison && dame.estLibre()) {
            dame.seFaireKidnapper(Brigand.this);
            nbDamesEnlevees++;
            parler("Ah ah ! " + dame.quelEstTonNom() + ", tu es mienne desormais !");
        } else if (enPrison) {
            parler("Je ne peux rien faire, je suis en prison...");
        } else {
            parler(dame.quelEstTonNom() + " est deja captive !");
        }
	}
	
	public void estEmprisonnePar(Cowboy cowboy) {
		if (!enPrison && nbDamesEnlevees > 0) {
			enPrison = true;
			nbDamesEnlevees = 0;
			parler("Damned, je suis fait ! " + cowboy.quelEstTonNom() + ", tu m as eu !");
		}else if (enPrison) {
            parler("Je suis deja en prison...");
		}else {
			parler("Je n ai rien fait de mal, laissez-moi tranquille !");
		}
	}
	
	
	
	@Override
	public String quelEstTonNom() {
		// TODO Auto-generated method stub
		return super.quelEstTonNom() + " le " + look;
	}

	public int getRecompense() {
		return nbDamesEnlevees * 100;
	}
	
	public String getLook() {
		return look;
	}

	@Override
	public void sePresenter() {
		// TODO Auto-generated method stub
		super.sePresenter(); //Appelle la présentation de Humain
		parler("J'ai l'air " + look + " et j'ai deja kidnappe " + nbDamesEnlevees + " dames !");
		parler("Ma tete est mise a prix " + getRecompense() + " € ");
	}

	public boolean isEnPrison() {
		return enPrison;
	}
}

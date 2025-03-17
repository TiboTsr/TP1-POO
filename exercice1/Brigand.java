//package exercice1;

public class Brigand extends Humain {

	private String look;
	private int nbDamesEnlevees;
	private boolean enPrison;
	
	public Brigand(String nom) {
		super(nom);
		this.look = "m�chant";
		this.nbDamesEnlevees = 0;
		this.enPrison = false;
	}
	
	public Brigand(String nom, String look){
		super(nom);
		this.look = look;
		this.nbDamesEnlevees = 0;
		this.enPrison = false;
	}
	

	public void kidnapper(Dame dame){
		if (!enPrison && dame.estLibre()) {
            dame.seFaireKidnapper(Brigand.this);
            nbDamesEnlevees++;
            parler("Ah ah ! " + dame.quelEstTonNom() + ", tu es mienne d�sormais !");
        } else if (enPrison) {
            parler("Je ne peux rien faire, je suis en prison...");
        } else {
            parler(dame.quelEstTonNom() + " est d�j� captive !");
        }
	}
	
	public void estEmprisonnePar(Cowboy cowboy) {
		if (!enPrison && nbDamesEnlevees > 0) {
			enPrison = true;
			nbDamesEnlevees = 0;
			parler("Damned, je suis fait ! " + cowboy.quelEstTonNom() + ", tu m�as eu !");
		}else if (enPrison) {
            parler("Je suis d�j� en prison...");
		}else {
			parler("Je n�ai rien fait de mal, laissez-moi tranquille !");
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

	public boolean isEnPrison() {
		return enPrison;
	}
}


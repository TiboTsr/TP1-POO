package exercice1;

public class Histoire{
	public static void main(String[] args) {
		System.out.println("---------------Question 1.1---------------");
		//Creer une instance de la classe Humain
		Humain humain1 = new Humain("Tibo");
		
		humain1.parler("Coucou c'est moi !");
		humain1.sePresenter();
		humain1.boire();
		humain1.choisirBoissonFavorite("eau mais petillante");
		humain1.sePresenter();
		humain1.boire();
		
		System.out.println("---------------Question 1.2---------------");
		
		Cowboy cowboy = new Cowboy("Jonesy");
		Brigand brigand = new Brigand("Midas");
		Dame dame = new Dame("Renegade Raider", "dorée");
		
		 // Présentation des personnages
        cowboy.sePresenter();
        brigand.sePresenter();
        dame.sePresenter();

        // Test des actions
        brigand.kidnapper(dame);
        cowboy.liberer(dame);
        cowboy.tirer(brigand);
        brigand.estEmprisonnePar(cowboy);
        
        System.out.println(dame.quelEstTonNom()); 
        System.out.println(brigand.quelEstTonNom());
        System.out.println(cowboy.quelEstTonNom());  

	}
}

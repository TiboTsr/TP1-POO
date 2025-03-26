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
		Dame dame = new Dame("Renegade Raider", "doree");
		
		 // Pr�sentation des personnages
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
        
        cowboy.sePresenter();
        brigand.sePresenter();
        dame.sePresenter();
        
        Barman barman = new Barman("Chevalier noir");
        Barman barman2 = new Barman("Tibo le barman", "Le bar de Tibo");
        
        barman.sePresenter();
        barman2.sePresenter();
        
        barman.servir(cowboy);
        barman.servir(brigand);
        barman.servir(dame);
        
        Sherif sherif = new Sherif("Kaaris");
        sherif.sePresenter();
        sherif.rechercherBrigand(brigand);
        sherif.coffrerBrigand(brigand);
        sherif.sePresenter();
        
        

	}
}
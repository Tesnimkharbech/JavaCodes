
public class TestBibliotheque {

	public static void main(String[] args) {
		
		Bibliotheque B=new Bibliotheque();
		B.ajoutOuvrage(new Livre("Informatique","10/11/2009",false,"Dupon"));
		B.ajoutOuvrage(new Livre("Programmation Java","05/08/2008",false,"Lepetit"));
		B.ajoutOuvrage(new Video("Apprendre le Java","05/08/2008",false,"Multimédia",60));
		System.out.println("La bibliothèque contient: ");
		B.afficheContenu();
		System.out.println("Résultat de la recherche de l'ouvrage 'informatique'");
		if(B.getOuvrage("Informatique")==null)
		System.out.println("L'ouvrage n'existe pas dans la bibliothèque");
		else
		{ if(B.getOuvrage("Informatique").getDispo())
		System.out.println("L'ouvrage se trouve dans la bibliothèque");
		else
		System.out.println("L'ouvrage se trouve dans la bibliothèque mais il est actuellement indisponible");
		B.getOuvrage("Informatique").affiche();
		}}}
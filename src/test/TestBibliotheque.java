
public class TestBibliotheque {

	public static void main(String[] args) {
		
		Bibliotheque B=new Bibliotheque();
		B.ajoutOuvrage(new Livre("Informatique","10/11/2009",false,"Dupon"));
		B.ajoutOuvrage(new Livre("Programmation Java","05/08/2008",false,"Lepetit"));
		B.ajoutOuvrage(new Video("Apprendre le Java","05/08/2008",false,"Multim�dia",60));
		System.out.println("La biblioth�que contient: ");
		B.afficheContenu();
		System.out.println("R�sultat de la recherche de l'ouvrage 'informatique'");
		if(B.getOuvrage("Informatique")==null)
		System.out.println("L'ouvrage n'existe pas dans la biblioth�que");
		else
		{ if(B.getOuvrage("Informatique").getDispo())
		System.out.println("L'ouvrage se trouve dans la biblioth�que");
		else
		System.out.println("L'ouvrage se trouve dans la biblioth�que mais il est actuellement indisponible");
		B.getOuvrage("Informatique").affiche();
		}}}
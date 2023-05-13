public class Livre extends Ouvrage{
String  auteur;
Livre(String t,String d,boolean i, String auteur){
	super(t,d,i);
	this.auteur=auteur;
}
void affiche () {
	super.affiche(); //acceder à la méthode de la classe mére
	 System.out.println("Le type : Livre\nL'auteur : "+ auteur);
	// System.out.println("le nom de l'auteur est "+ auteur);

}}

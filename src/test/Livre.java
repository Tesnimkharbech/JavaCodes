public class Livre extends Ouvrage{
String  auteur;
Livre(String t,String d,boolean i, String auteur){
	super(t,d,i);
	this.auteur=auteur;
}
void affiche () {
	super.affiche(); //acceder � la m�thode de la classe m�re
	 System.out.println("Le type : Livre\nL'auteur : "+ auteur);
	// System.out.println("le nom de l'auteur est "+ auteur);

}}

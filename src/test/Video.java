
public class Video extends Ouvrage {
String editeur ;
double duree;
Video (String t,String d,boolean i, String editeur,double duree){
	super(t,d,i);
	this.editeur=editeur;
	this.duree=duree;
}
void affiche () {
	super.affiche();	
	System.out.println("Le type : Video\nL'�diteur : "+editeur+"\nLa dur�e : "+duree);
	//System.out.println("L'�diteur est "+editeur+" La dur�e est "+duree);

}}

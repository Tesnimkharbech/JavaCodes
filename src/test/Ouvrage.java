//TP3_PARTIE A
public class Ouvrage {
String titre, datec;
boolean ind;
Ouvrage(String t, String d, boolean i){
	titre=t;
	datec=d;
	ind=i;
}
	void affiche () {
		 System.out.println("Le titre : "+titre+"\nLa date de cr�ation : "+datec);
		 System.out.println((ind)?"Cet ouvrage est disponible":"Cet ouvrage est indisponible pour le moment (emprunt�)");
	}
	boolean getDispo() {
		return (ind);
	} 
	


}

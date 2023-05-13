package tass;
public class Vecteur {
	private float x,y; //priv� = accessible pour cette classe seulement

	//le premier constructeur permet d�initialiser x et y avec la m�me valeur
/*	public Vecteur (float x) {
		this.x=x;
		this.y=x;
		//this => variable globale et non pas locale(pas de confusion)
	}
*/
	//le deuxi�me constructeur permet d�initialiser x et y avec deux valeurs diff�rentes.
	public Vecteur (float x,float y) {
		this.x=x;
		this.y=y;
	}	
	void afficher() {
		System.out.println("L'abscice du vecteur = "+x+" et l'ordonn�e = "+y);
	}
	
	
	float prod_scal(Vecteur v) { return (x*v.x)+(y*v.y); }
	
	public static void main(String args[]) {
		Vecteur v1= new Vecteur(2,5.8f);
		Vecteur v2= new Vecteur(5,3.4f);
		
		v1.afficher();
		v2.afficher();
		float p= v1.prod_scal(v2);
		System.out.println("Le produit scalaire des deux vecteurs = "+p);
	}
}

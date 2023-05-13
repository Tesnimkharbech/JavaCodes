package tp3;

public class Point {
	char nom;
	double abs;
Point (char a, double x){
	nom=a;
	abs=x;
}

	void affiche() {
	System.out.println("Le nom du point : "+nom+" Son abscisse  = "+abs);
	}
	void translate(double s) {
	abs+=s;
	}
}

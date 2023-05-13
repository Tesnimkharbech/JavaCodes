package tass;
public class Etudiant {
	String nom;
	private double n1,n2,n3,n4;	
	public Etudiant (String n, double a, double b, double c, double d){
		nom=n;
		n1=a; n2=b; n3=c;  n4=d;	}

	void affiche () {
		System.out.println("Le nom de l'étudiant est : "+nom);
		System.out.println("Ses notes sont : "+n1+" ,"+n2+" ,"+n3+" ,"+n4);
	}
	double moyenne() {  return (n1+n2+n3+n4)/4 ;  }
	void resultat () {
		if  (moyenne()<10) { System.out.println("L'étudiant est non admis");}
		else {System.out.println("L'étudiant est admis");}
	}
	public static void main (String args[]) {
		Etudiant e1= new Etudiant("Ali",11,13,18,7);
		Etudiant e2= new Etudiant("Faten",15,9,8,16);
		e1.affiche();
		e2.affiche();
		System.out.println("La moyenne de l'étudiant est : "+e1.moyenne());
		System.out.println("La moyenne de l'étudiant est : "+e2.moyenne());
		e1.resultat();
		e2.resultat();		
	}
}

package examtp2019zoo.animal;

public class Autruche extends Animal{
	String nourriture="vegetarien";
	double qt=5;
	
	double pdmax=50;
	String cri="beuglement";
	Autruche(String n, double p){
			super(n,p);
		}
public String toString() {
	return "L'animal "+super.nom+" est un autruche, de poids "+super.poids+"kg, ne d�passant pas"+pdmax+"kg, il est v�g�tarien, il mange "+super.poids/pdmax*qt+"kg de fruits/jour d'un cout= "+cout()+" euro, son cri est un beuglement"; 
}
double cout() {
	return ( super.poids/pdmax*qt);
}
	}

package examtp2019zoo.animal;

public class Chimpanze  extends Animal{
	String nurriture="vegetarien";
	double qt=3;
	
	double pdmax=100;
	String cri="hurlement";
	Chimpanze(String n, double p){
			super(n,p);
		}
	public String toString() {
		return "L'animal "+super.nom+" est un chimpanzé, de poids "+super.poids+"kg, ne dépassant pas"+pdmax+"kg, il est végétarien, il mange "+(qt*super.poids/pdmax)+"kg de fruits/jour d'un cout= "+cout()+" euro, son cri est un hurlement"; 
	}
	double cout() {
		return (qt* super.poids/pdmax);
	}
	}


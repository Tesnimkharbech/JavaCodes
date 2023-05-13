package examtp2019zoo.animal;

public class Orque  extends Animal{
	String nurriture="carnivore";
	double qt=7;
	
	double pdmax=500;
	String cri="sifflement";
	Orque(String n, double p){
			super(n,p);
		}
	public String toString() {
		return "L'animal "+super.nom+" est un orque, de poids "+super.poids+"kg, ne dépassant pas"+pdmax+"kg, il est carnivore, il mange "+super.poids/pdmax*qt+"kg de viande d'un cout= "+cout()+" euro, son cri est un sifflement"; 
	}
	double cout() {
		return ( super.poids/pdmax*qt*10);
	}
}

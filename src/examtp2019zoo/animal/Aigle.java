package examtp2019zoo.animal;

public class Aigle extends Animal{
String nurriture="carnivore";
double qt=1;
int envergure;
double pdmax=200;
String cri="sifflement";
	Aigle(String n, double p){
		super(n,p);
	}
	Aigle(String n, double p,int e){
		super(n,p);
		envergure=e;
	}
	public String toString() {
		return "L'animal "+super.nom+" est un aigle, de poids "+super.poids+"kg, ne dépassant pas"+pdmax+"kg, il est carnivore, il mange "+super.poids/pdmax*qt+"kg de viande d'un cout= "+cout()+" euro, son cri est un sifflement"; 
	}
	double cout() {
		return ( super.poids/pdmax*qt*10);
	}
}

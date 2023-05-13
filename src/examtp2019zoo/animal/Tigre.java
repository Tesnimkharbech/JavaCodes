package examtp2019zoo.animal;

public class Tigre extends Animal{
	String nurriture="carnivore";
	double qt=4;
	int nbrayures;
	double pdmax=150;
	String cri="feulement";
	Tigre(String n, double p, int nb){
			super(n,p);
			nbrayures=nb;
		}
	public String toString() {
		return "L'animal "+super.nom+" est un tigre ayant "+nbrayures+" de rayures, de poids "+super.poids+"kg, ne dépassant pas"+pdmax+"kg, il est carnivore, il mange "+qt*super.poids/pdmax+"kg de viande d'un cout= "+cout()+" euro, son cri est un feulement"; 
	}
	double cout() {
		return ( super.poids/pdmax*qt*10);
	}}

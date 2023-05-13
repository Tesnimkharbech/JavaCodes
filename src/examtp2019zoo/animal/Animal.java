package examtp2019zoo.animal;

abstract class Animal {
String nom;
double poids;
Animal(String e, double poids){
	this.poids=poids;
	nom=e;
}
public abstract String toString();
abstract double cout();
}

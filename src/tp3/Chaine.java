package tp3;
	//TP2 - Manipulation 3
public class Chaine {
String s;
	Chaine (String c){	s=c;	}     //Constructeur
int occurenceCar (char c, int i) {
	int j=0;
	int nbOcc=0;
	for (j=i; j<s.length();j++) {
		if (Character.toUpperCase(s.charAt(j))==Character.toUpperCase(c)) {
			nbOcc++;
		}
	}
	return nbOcc;	}
boolean existeCar ( char c, int deb , int fin ) {
	int i=deb;	
	while(i<=fin) {
		if (Character.toUpperCase(c)==Character.toUpperCase(s.charAt(i)) ) {
			return true;}
		i++;	
	}
	return false;		}
int occurenceMultiple() {
	int i=0;
	int nbCar=0;
	for (i=0;i<s.length();i++) {
		if (( occurenceCar(s.charAt(i),i)>1) && ( (existeCar(s.charAt(i),0,i-1)) == false )) {
			 nbCar ++;
		}
	}
	return (nbCar);		}
public static void main (String args[]) {
	Chaine ch = new Chaine("azozzbnatoioooxyb"); //4 occurences
	System.out.print("Le nombre d'occurence multiple = "+ch.occurenceMultiple());
}
}

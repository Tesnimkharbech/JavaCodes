package examtp2018;
class Cours {
	Membre [] ArrayList ;
Cours (int n){
	 ArrayList=new Membre [n];
}
int effect() {
	 int i=0;
	while (ArrayList[i]!=null) {
		i++;
	}
	return i;
}
void ajoutmemb(Membre m) {
	ArrayList[effect()]=m;
}
 
double ageMoy() {
	int s=0;
	int nbetud=0;
	for (int i=0;i<effect();i++) {
		s+=(ArrayList[i] instanceof Etudiant)?((Etudiant)ArrayList[i]).age:0;
		nbetud+=(ArrayList[i] instanceof Etudiant)?1:0;
	}
	return (s/nbetud);
}
}

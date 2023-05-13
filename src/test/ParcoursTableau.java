
public class ParcoursTableau {
//EX1 TD2
	private int[] tab; 
	ParcoursTableau (int n) //constructeur : alloue un tableau de dimension n
	{tab=new int [n];	}
		/*m�thode remplir : remplit le tableau par des valeurs
	 	g�n�r�s al�atoirement entre 0 et 100 */
	void remplir () {
		for (int i=0;i<tab.length;i++) {
			tab[i]=(int)(Math.random()*100);
		}
	} 
		/* m�thode moyenne : calcule la moyenne des �l�ments du tableau*/
	float moyenne() {
		return (somme()/tab.length);
	}
		//m�thode somme : calcule la somme des �l�ments du tableau
	int somme() {
		int s=0;
		for (int i=0;i<tab.length;i++) {
			s+=tab[i];
		}
		return s;
	}
		//m�thode max : retourne la plusgrande valeur dans le tableau
	float max() {
		float m=tab[0];
		for (int i=1;i<tab.length;i++) {
			m=(tab[i]>m)?tab[i]:m;
		}
		return m;
	}
		//m�thode min  : retourne la pluspetite valeur dans le tableau
	float min() {
		float m=tab[0];
		for (int i=1;i<tab.length;i++) {
			m=(tab[i]<m)?tab[i]:m;
		}
		return m;}	
		/*m�thode recherche : recherche un �l�ment dans le tableau,retourne son indice s'il est trouv� et -1 sinon*/
	int recherche(int x) {
		int i=0;
		while (i<tab.length) {
			if (tab[i]==x) {return (i);}
			else {i++;}
		}
		return -1;
	}
		/*m�thode affiche : affiche sur �cran les �l�ments du tableau*/
	void affiche() {
		for (int i=0;i<tab.length;i++) {
			System.out.println("tab["+i+"]= "+tab[i]);
		}
	}
	public static void main(String arg[]) {
		ParcoursTableau t = new ParcoursTableau(3);
		t.remplir();
		t.affiche();
		System.out.println("Le max = "+t.max()+"\nLe min = "+t.min()+"\nLa somme = "+t.somme()+"\nLa moyenne = "+t.moyenne());
		System.out.println(t.recherche(20));

	}
}

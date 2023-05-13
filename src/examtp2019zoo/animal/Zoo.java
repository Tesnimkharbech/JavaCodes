package examtp2019zoo.animal;

public class Zoo {
	String nom;
	int nbmax;
	Animal[] z;

	Zoo(String nom, int nbmax) {
		this.nbmax = nbmax;
		this.nom = nom;
		z = new Animal[nbmax];
	}
	Zoo(String nom) {
		this.nom = nom;	
		nbmax=100;
		z = new Animal[nbmax];
		}

	void ajout(Animal m) {
		if (nbact() < nbmax) {
			z[nbact()] = m;

			System.out.println("L'animal " + m.nom + " est ajout�");

		} else {
			System.out.println(
					"L'ajout d'un animal est impossible: le nombre maximal d'animaux " + nbmax + " est atteint!");
		}
	}

	void supp(Animal m) {
		int i;
		for (i = 0; i < nbact(); i++) {
			if (m.nom.equalsIgnoreCase(z[i].nom)) {
				int j=0;
				for ( j = i + 1; j < nbact(); j++) {
					z[j - 1] = z[j];
				}
				z[j-1]=null;
				System.out.println("L'animal " + m.nom + " est supprim�");
				break;
			}
		}
		if (i == nbmax) {
			System.out.println("L'animal � supprimer n'existe pas");
		}
	}

	int nbact() {
		int i = 0;
		while (z[i] != null) {
			i++;
		}
		return i;
	}

	double couttot() {
		double c = 0;
		for (int i = 0; i < nbact(); i++) {
			c += z[i].cout();
		}
		return c;
	}

void affiche() {
	System.out.print("Le zoo "+nom+" contient "+nbact()+" animaux,");
	//System.out.println((nbact()<nbmax)?" et peut recevoir encore "+(nbmax-nbact())+".":", le zoo est plein.");
	System.out.println("La liste des animaux pr�sents est la suivante:");
	for (int i=0;i<nbact();i++) {
		System.out.println(z[i].toString());
	}
	System.out.println("Le cout total de nourriture= "+couttot()+" euro");
}
}

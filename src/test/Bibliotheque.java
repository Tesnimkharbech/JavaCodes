public class Bibliotheque {
Ouvrage b [];
int nbmax,nbactu;
	Bibliotheque(int n){
		nbmax=n;
		b= new Ouvrage[n];
	}
	Bibliotheque(){		this(25);	}
	void ajoutOuvrage(Ouvrage o ) {
		boolean nomsident=false;
		if (nbmax>nbactu) {
			for (int i=0;i<nbactu;i++) {
				if (o.titre.equalsIgnoreCase(b[i].titre)) {
					nomsident=true;
					break;}
			}
			if (!nomsident) { b[nbactu]=o;
							  nbactu++;}
		}
	}
	Ouvrage getOuvrage(String t) {
		for (int i=0;i<nbactu;i++) {
			if (t.equalsIgnoreCase(b[i].titre)) {	return (b[i]);	}
		}
		return null;
	}
	void afficheContenu() {
		for (int i=0;i<nbactu;i++) {
			System.out.println("****************Ouvrage n°"+(i+1)+"****************");
			if (b[i] instanceof Livre ) {
				((Livre)b[i]).affiche();
			}
			else if (b[i] instanceof Video) {
				((Video)b[i]).affiche();
			}
		}
	}}

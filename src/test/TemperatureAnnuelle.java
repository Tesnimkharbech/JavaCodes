//TP2 PARTIE B 
public class TemperatureAnnuelle {
int n;
TemperatureJournaliere[] t;
	TemperatureAnnuelle(TemperatureJournaliere[] x){	t=x;	}
	TemperatureAnnuelle(int n){
		this.n=n;
		t= new TemperatureJournaliere[n];
	}
	TemperatureAnnuelle() {
		this.n=365;
		t= new TemperatureJournaliere[365];
	}
	float max() {
		float m=t[0].max();
		for (int i=1;i<this.effect();i++) {
			m=(t[i].max()>m)?t[i].max():m;
		}
		return m;
	}
	float min() {
		float m=t[0].min();
		for (int i=1;i<this.effect();i++) {
			m=(t[i].min()<m)?t[i].min():m;
		}
		return m;
	}
	float moy() {
		float m=0;
		for (int i=0;i<this.effect();i++) {
			m+=t[i].moy();
		}
		return m/this.effect();
	}
	public int effect() {
		int nb=-1;
		do {
			nb++;
		} while ((t[nb]!=null)&&(nb<n));
		return nb;
	}
	public void ajout(TemperatureJournaliere t1) {
		int nb=effect();
		if (nb<n) {
			t[nb]=t1;
		}else {
			System.out.println("erreur");
		}
	}
	public String toString() {
		String ch="Les températures sont :\n";
		for (int i=0;i<effect();i++) {
			ch+=t[i].toString()+"\n";
		}
		return ch;
	}
	void  affiche() {
		System.out.println(toString());
	}
	
	
}

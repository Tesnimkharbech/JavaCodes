//TP2 PARTIE B
public class TemperatureJournaliere {
	float tempMatin=0;
	float tempSoir=0;
	TemperatureJournaliere(float m, float s){
		tempMatin=m;
		tempSoir=s;	}
	TemperatureJournaliere(float m){
		tempMatin=m;
		tempSoir=m;	}
	TemperatureJournaliere(){
		tempMatin=0;
		tempSoir=0;	}
	public String toString() {
		return("La temperature du matin="+tempMatin+"\nLa temperature du soir="+tempSoir);
	}
	public void affiche() {
		System.out.println(this.toString());
	}
	float max() {
		return (tempMatin<tempSoir)?tempSoir:tempMatin;
	}
	float min() {
		return (tempMatin<tempSoir)?tempMatin:tempSoir;
	}
	float moy() {
		return (tempMatin+tempSoir)/2;
	}
	
	public static void main(String args[]) {
		TemperatureJournaliere t1= new TemperatureJournaliere(15,8);
		t1.affiche();
		System.out.println("La temperature maximale = "+t1.max()+" , la temperature minimale = "+t1.min()+" et leur moyenne="+t1.moy());
		TemperatureJournaliere t2= new TemperatureJournaliere(18,12);
		TemperatureAnnuelle tn= new TemperatureAnnuelle(3);
		tn.ajout(t1);
		tn.ajout(t2);
		System.out.println("L'effectif= "+tn.effect()+", la moyenne= "+tn.moy()+", la temperature max= "+tn.max()+", la temperature min= "+tn.min());
		tn.affiche();
	}
}

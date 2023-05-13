import java.util.Scanner;
//EX2 TD2
public class Jeux {
	 int tab[]= new int [10];
	 int x;
/* 	void remplir() {
		 for (int i=0;i<tab.length;i++) {
			 tab[i]=(int)(Math.random()*10); }
	 }
	 Remplissage aléatoire
*/
	 void remplir() {
		 for (int i=0;i<tab.length;i++) {
			 System.out.print("tab["+i+"]= ");
			 Scanner scan = new Scanner (System.in);
			 int a = scan.nextInt();
			 tab[i]=a;
		 } //Remplissage manuel
	 }
	 String gagne (int x) {
		 for (int i=0;i<tab.length;i++) {
				if (tab[i]==x) {
					return("Vous avez gagné");	}}
		 return("Vous avez perdu");
	 }
		public static void main(String arg[]) {
			Jeux j=new Jeux();
			 System.out.print("Choisissez un entier : ");
			Scanner scan = new 	Scanner (System.in);
			int k = scan.nextInt();
			j.remplir();
			System.out.println(j.gagne(k));
		}
}

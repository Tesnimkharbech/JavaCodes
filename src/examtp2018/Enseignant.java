package examtp2018;

import java.util.Scanner;

class Enseignant extends Membre{
private String grade;
	 Enseignant(int id) {
		 super(id);
	}
	 void entrerInfo() {
			System.out.println("Entrer les infos de l'enseignant :");
			Scanner Scan = new Scanner(System.in);
			grade=Scan.nextLine();
		}
}

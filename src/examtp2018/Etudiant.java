package examtp2018;

import java.util.Scanner;

public class Etudiant extends Membre {
public int age;
	public Etudiant(int id) {
		super(id);
	}
	void entrerInfo() {
		System.out.println("Entrer les infos de l'étudiant :");
		Scanner Scan = new Scanner(System.in);
		age=Integer.parseInt( Scan.nextLine());
	}
}

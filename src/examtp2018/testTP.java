package examtp2018;

public class testTP {

	public static void main(String[] args) {
		Etudiant e1 = new Etudiant(124535618);
		e1.entrerInfo();
		Membre e2 = new Etudiant(852745310);
		e2.entrerInfo();
		Etudiant e3 = new Etudiant(162308847);
		e3.entrerInfo();
		Membre e4 = new Etudiant(361249610);
		e4.entrerInfo();
		Membre e5 = new Etudiant(458001245);
		e5.entrerInfo();
		Enseignant es1 = new Enseignant(447759203);
		es1.entrerInfo();
		Membre es2 = new Enseignant(202145841);
		es2.entrerInfo();
		Cours c = new Cours(20);
		c.ajoutmemb(e1);
		c.ajoutmemb(e2);
		c.ajoutmemb(e3);
		c.ajoutmemb(e4);
		c.ajoutmemb(e5);
		c.ajoutmemb(es1);
		c.ajoutmemb(es2);
		System.out.print("L'age moyen des etudiants = "+c.ageMoy());

	}

}

package examtp2019zoo.animal;

public class GestZoo {

	public static void main(String[] args) {
Zoo z= new Zoo("Minatec");
z.ajout(new Tigre("fantome",12,40));
z.ajout(new Autruche("ann",50));
z.ajout(new Chimpanze("chita",30));
z.ajout(new Aigle("roquette",5,200));
z.ajout(new Orque("azog",90));
z.affiche();
z.supp(new Tigre("fantome",12,40));
z.affiche();

	}

}

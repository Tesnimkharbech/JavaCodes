package tass;

public class Disque {
	float rayon;
	public Disque (float r) {
		rayon=r;
	}
	public double perimetre() {
		return 2*rayon*Math.PI;
	}
	public double surface() {
		return Math.pow(rayon, 2)*Math.PI;
	}
	public static void main(String tbArgs[]) {
		Disque d1= new Disque(25);
		Disque d2= new Disque(5.8f);
		System.out.println("Le rayon de d1 : "+d1.rayon);
		System.out.println("Le rayon de d2 : "+d2.rayon);
		System.out.println("Le périmetre de d1 : "+d1.perimetre());
		System.out.println("Le périmetre de d2 : "+d2.perimetre());
		System.out.println("La surface de d1 : "+d1.surface());
		System.out.println("La surface de d2 : "+d2.surface());
	}
}

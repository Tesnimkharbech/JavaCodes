package tp3;

import java.util.Scanner;

public class TestchMV {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);

		String str=sc.nextLine();
		ChaineMV ch = new ChaineMV(str);
		System.out.println("Le nombre de voyelles dans '"+str+"' = "+ch.nbvoy());
		System.out.println("Le nombre de mots : "+ch.nbmots());
		
		}
}


package tp3;
import java.util.Scanner;
public class Testch {
	//TP 2 - Manipulation 2
	public static void main (String args[]) {
		int i=0;
		for (i=1;i<3;i++) {
		Scanner sc = new Scanner (System.in);
		String str=sc.nextLine();
		System.out.println("Test n°"+i+" :");
		System.out.println("Entrez une chaine :");
		ChaineEtPalindromes ch = new ChaineEtPalindromes(str);
		System.out.println(str);
		System.out.println("L'inverse: "+ch.inverse() );
		System.out.println(ch.estPalindrome());		}
	}

}

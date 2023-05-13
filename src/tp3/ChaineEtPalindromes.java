package tp3;
//TP 2 - Manipulation 1
public class ChaineEtPalindromes {
 String s;
 ChaineEtPalindromes(String ch){
	 s=ch;
 }
 String inverse () {
	 String ch1="";
	 int i=0;
	 for (i=s.length()-1; i>=0 ; i--) {
		ch1=ch1+s.charAt(i);
	 }
	 return ch1;
 }
 
  boolean estPalindrome() {
	 return (s.equals(inverse()));
	 
 }
}

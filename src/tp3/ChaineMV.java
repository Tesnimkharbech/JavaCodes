package tp3;
//TD2 EX3
import java.util.Scanner;
public class ChaineMV {
	String s;	
	public ChaineMV (String ch){	s=ch;	}	
	int nbvoy() {
		int n=0;
		char c;
		int i=0;
		s=s.toUpperCase();
		for (i=0;i<s.length();i++) {		
			c=s.charAt(i);
			if (( c =='A')||( c =='E')||( c=='Y')||( c =='U')||( c =='O')||( c=='I'))  {	n++;	}
		}
		return n;		
	}	
	int nbmots() {		
		if (s=="") return 0;		//chaine vide
		int n=0;
		boolean esp=false;
		int i=0;
		for (i=0;i<s.length();i++) {
			if ((s.charAt(i)==' ')&&(esp==false)){	n++;}
			if (s.charAt(i)==' ') {	  esp=true;	}
			else {	esp=false;	}		
		}
		n++;
		if (s.charAt(0)==' ') {		n--;	}
		if (s.charAt(s.length()-1)==' ') {	n--;	}
		return n;
	}	
}

package tass;

public class TestRect {
public static void main(String[] tbArgs) {
Rectangle r1 = new Rectangle();
Rectangle r2 = new Rectangle();
r1.longueur=5;r1.largeur=20;
r2.longueur=2;r2.largeur=42.3f;
float p1 = r1.permimetre();
float p2=r2.permimetre();
float s1 = r1.surface();
float s2=r2.surface();
System.out.println("Le rectange de longueur="+r1.longueur+" de largeur="+r1.largeur+
" a pour valeur de perimetre:"+p1 +" et pour valeur de surface: "+s1);
System.out.println("Le rectange de longueur="+r2.longueur+" de largeur="+r2.largeur+
" a pour valeur de perimetre:"+p2 +" et pour valeur de surface: "+s2);
}
}
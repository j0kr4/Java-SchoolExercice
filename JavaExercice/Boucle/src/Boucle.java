import java.util.Random;
import java.util.Scanner;

public class Boucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Scanner a = new Scanner(System.in);
		
		int n = a.nextInt();
		int i = 0;
		
		for(i = 0; i < n; i++ ) {
			if(i%2 != 0)
				System.out.println(+i);
		}*/
		
		/*Scanner a = new Scanner(System.in);
		
		int n = a.nextInt();
		int i = 0;
		
		while(i<n) {
			i++;
			if(i%2 != 0)
				System.out.println(+i);
		}*/
		
		/*Scanner a = new Scanner(System.in);
		
		System.out.println("Combien de moutons ? ");
		int mouton = a.nextInt();
		
		if(mouton < 1)
			System.out.println("saisissez un autre nombre.");
		
		for(int i = 1; i < mouton; i++) {
			System.out.println(+ i + " moutons");
		}*/
		
		/*Scanner a = new Scanner(System.in);
		
		System.out.println("Longueur ? ");
		int longueur = a.nextInt();
		
		System.out.println("Intervale ? ");
		int intervale = a.nextInt();
		
		for(int i= 0; i<longueur; i++)
			if(i % intervale==0)
				System.out.print("|");
			else
				System.out.print("-");*/
		
		/*Scanner a = new Scanner(System.in);
		
		System.out.println("combien de nombre ? ");
		int nb = a.nextInt();
		int somme=0;
		
		for(int i = 1; i <= nb; i++) {
			System.out.println("Nombre" + i);
			int ch = a.nextInt();
			somme += ch;
		}
		System.out.println(+somme/nb);*/
		
		/*Scanner a = new Scanner(System.in);
		
		System.out.println("Coté ? ");
		int N = a.nextInt();
		int i = 1;
		
		for(i = 1; i < N+1;) {
			for(int j = 0; j < i; j++) {
			System.out.print("*");	
		}
		i++;
		System.out.println("");
		}*/
		
		Scanner a = new Scanner(System.in);
		
		int cpt = 0;
		int inf = 0;
		int sup = 100;
		System.out.println("choisissez votre difficulté : 1? 2? 3?");
		int diff = a.nextInt();
		
		if(diff == 1) {
			cpt = 20;
		}
		else if(diff == 2) {
			cpt = 10;
		}
		else if(diff == 3) {
			cpt = 5;
		}
		else {
			System.out.println("cette difficulté n'existe pas");
			System.exit(0);
		}
		
		System.out.println("choisis le nombre : ");
		int N = a.nextInt();
		while(N < 0 || N > 100) {
			System.out.println("le nombre doit être compris entre 1 et 100.");
			System.out.println("rechoisis donc : ");
			N = a.nextInt();
		}
		
		Random r = new Random();
		int valeur = inf + r.nextInt(sup - inf);
		System.out.println("Est-ce " + valeur + "?");
		cpt--;
		
		while(valeur != N) {
			if(valeur < N) {
				inf = valeur;
				String p = "plus";
				String rep = a.next();
				if(rep.equals(p)) {
					System.out.println("plus");
					valeur = valeur +r.nextInt(sup-valeur);
					System.out.println("Est-ce " + valeur + "?");
				}
				else {
					System.out.println("erreur");
				}
			}
			else {
				sup = valeur;
				String m = "moins";
				String rep = a.next();
				if(rep.equals(m)) {
					System.out.println("moins");
					valeur = inf + r.nextInt(valeur-inf);
					System.out.println("Est-ce " + valeur + "?");
				}
				else {
					System.out.println("erreur");
				}
			}
			cpt--;
			if(cpt == 0) {
				break;
			}
		}
		if(cpt == 0) {
			if(valeur == N) {
				String oui ="oui";
				String rep = a.next();
				if(rep.equals(oui)) {
					System.out.println("oui");
				}
			}
			else {
				System.out.println("dommage");
			}
		}
		else {
			String oui ="oui";
			String rep = a.next();
			if(rep.equals(oui)) {
				System.out.println("oui");
			}
			else {
				System.out.println("erreur");
			}
		}
	}
}

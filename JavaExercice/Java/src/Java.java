import java.util.Scanner;

public class Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Scanner a = new Scanner(System.in);
	
		float aa = a.nextFloat();
		float bb = a.nextFloat();
		float res;
		float res1;
		
		res = aa*bb;
		System.out.println(res);
		
		res1 = aa/bb;
		if(bb==0)
		{
			System.out.println("erreur");
		}
		else
		{
			System.out.println(res1);
		}*/
		
		/*Scanner a = new Scanner(System.in);
		
		float aa = a.nextFloat();
		float bb = b.nextFloat();
		float tmp = 0;
		
		System.out.println("Avant permutation: ");
		System.out.println(aa);
		System.out.println(bb);
		
		System.out.println("Après la permutation: ");
		tmp = aa;
		aa = bb;
		bb = tmp;
		System.out.println(aa);
		System.out.println(bb);
		*/
		
		/*Scanner a = new Scanner(System.in);
		
		float rayon = a.nextFloat();
		float aire = (float) (Math.PI*Math.pow(rayon,2);
		float perimetre = (float) (2*Math.PI*rayon);
		
		System.out.println(aire);
		System.out.println(perimetre);*/
		
		/*Scanner a = new Scanner(System.in);
		
		int annee= a.nextInt();
		
		if(annee % 4 == 0 && annee % 100 != 0) {
			System.out.println("Bissextile");
		}else if(annee % 400 == 0) {
			System.out.println("Bissextile");
		}else {
			System.out.println("Non bissextile");
		}*/
		
		/*Scanner a = new Scanner(System.in);
		
		float nb1 = a.nextFloat();
		float nb2 = a.nextFloat();
		float nb3 = a.nextFloat();
		float valMax;
		
		if((nb1 > nb2) && (nb1 > nb3))
			valMax = nb1;
		else if((nb2 > nb1) && (nb2 > nb3))
			valMax = nb2;
		else
			valMax = nb3;
		System.out.println("valeur maxi saisie : " + valMax + "\n");
		*/
		
		/*Scanner a = new Scanner(System.in);
		
		int nb1 = a.nextInt();
		int nb2 = a.nextInt();
		int quotient;
		int reste;
		int valMax;
		int valMin;
		
		if( nb1 == 0 || nb2 == 0)
			System.out.println("erreur");
		
		else if(nb1 > nb2) {
			valMax = nb1;
			valMin = nb2;
			quotient = valMax/valMin;
			reste = valMax-(quotient*valMin);
			System.out.println(quotient);
			System.out.println(reste);
		}
		else {
			valMax = nb2;
			valMin = nb1;
			quotient = valMax/valMin;
			reste = valMax-(quotient*valMin);
			System.out.println(quotient);
			System.out.println(reste);
		}*/
		
		/*Scanner a = new Scanner(System.in);
		
		int nb1 = a.nextInt();
		int nb2 = a.nextInt();
		int nb3 = a.nextInt();
		
		if( nb1 > 23 || nb1 < 0 || nb2 > 59 || nb2 < 0 || nb3 > 59 || nb3 < 0)
			System.out.println("nombre incorect" );
		
		else if( nb1 == 0 && nb2 == 0 && nb3 == 0)
			System.out.println("valeur nul");
		
		else if( nb1 > 23 || nb1 < 0 || nb2 > 59 || nb2 < 0 || nb3 > 59 || nb3 < 0)
			System.out.println("nombre incorect" );
		
		else if(nb1 == 0 && nb2 == 0)
			System.out.println("vous avez saisie : " + nb3 + " secondes ");
		
		else if(nb1 == 0 && nb3 == 0)
			System.out.println("vous avez saisie : " + nb2 + " minutes ");
		
		else if(nb2 == 0 && nb3 == 0)
			System.out.println("vous avez saisie : " + nb1 + " heures ");
		
		else if(nb1 == 0)
			System.out.println("vous avez saisie : " + nb2 + " minutes " + nb3 + " secondes " );
		
		else if( nb2 == 0)
			System.out.println("vous avez saisie : " + nb1 + " heures " + nb3 + " secondes " );
		
		else if( nb3 == 0)
			System.out.println("vous avez saisie : " + nb1 + " heures " + nb2 + " minutes " );
		
		else if ( nb1 == 1 || nb2 == 1 || nb3 == 1)
			if(nb1 == 1 && nb2 == 1 && nb3 == 1)
				System.out.println("vous avez saisie : " + nb1 + " heure " + nb2 + " minute " + nb3 + " seconde " );
			else if(nb1 == 1 && nb2 == 1)
				System.out.println("vous avez saisie : " + nb1 + " heure " + nb2 + " minute " + nb3 + " secondes " );
			else if(nb1 == 1 && nb3 == 1)
				System.out.println("vous avez saisie : " + nb1 + " heure " + nb2 + " minutes " + nb3 + " seconde " );
			else if(nb2 == 1 && nb3 == 1)
				System.out.println("vous avez saisie : " + nb1 + " heures " + nb2 + " minute " + nb3 + " seconde " );
			else if(nb1 == 1)
				System.out.println("vous avez saisie : " + nb1 + " heure " + nb2 + " minutes " + nb3 + " secondes " );
			else if( nb2 == 1)
				System.out.println("vous avez saisie : " + nb1 + " heures " + nb2 + " minute " + nb3 + " secondes " );
			else if(nb3 == 1)
				System.out.println("vous avez saisie : " + nb1 + " heures " + nb2 + " minutes " + nb3 + " seconde " );
			*/
			
		Scanner a = new Scanner(System.in);
		
		int nombre = a.nextInt();
		int  jour, heure, minute, seconde;
		
		heure = nombre/3600;
		minute = (nombre-heure*3600)/60;
		seconde = nombre-(heure*3600+minute*60);
		
		if(heure > 23) {
			jour = heure / 24;
			System.out.println("Nous avons : " + jour + " jours " + heure + " heures " + minute + " minutes " + seconde + " secondes ");
		}
		else
			System.out.println("Nous avons : " + heure + " heures " + minute + " minutes " + seconde + " secondes ");
	}

}

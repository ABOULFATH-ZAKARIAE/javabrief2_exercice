package exercices;

import java.util.Scanner;

public class exercice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x;
		int y;
		double taux = 0.01;
		double soldprecident;
		
	Scanner scanner = new Scanner(System.in);
	System.out.println("Un compte bancaire est de somme : ");
	x = scanner.nextInt();
	soldprecident = x;
	System.out.println("Un nombre de mois : ");
	y = scanner.nextInt();
	//10.000€ * 1,75% * 12/12 = 175€.
	scanner.close();
	for (int i = 0; i < y; i++) {
		x = x+(x*taux);
	}
	System.out.println("le montant finale de "+y+" mois est: "+x);

}
}

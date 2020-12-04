package exercices;

import java.util.Scanner;


public class exercice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nbr;
		Scanner scanner = new Scanner (System.in);
		System.out.println("Entrez un nombre :");
		nbr = scanner.nextInt();
		scanner.close();
		//Le programme n’accepte que les nombres positifs
		if (nbr > 0 ) {
			/*Écrivez un programme qui calcule la racine carrée de nombres fournis en donnée (les
			nombres doivent être saisies au clavier)*/
		System.out.println("le raccine de "+nbr+" est "+ Math.sqrt(nbr));
	}
		//Si on introduit un nombre négatif, on reçoit un message d’information
		
		if (nbr < 0){
		System.out.println("le nombre est négatif");
	}
		//Tapez 0 pour sortir du programme
		if (nbr == 0) {
			System.out.println("good bye");
		}
	}


}

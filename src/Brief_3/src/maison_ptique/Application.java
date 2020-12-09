package maison_ptique;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne [] P = new Personne[2];
		P [0] = new Medcine ("Maher", 31);
		P [1] = new opticienne ("Iman", 33);
		for (int i = 0; i < P.length; i++)
			P[i].afficher();

	}

}

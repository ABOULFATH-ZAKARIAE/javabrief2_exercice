package exercice3;

import exercice3.compte;

public class test {

    public static void main(String[] args) {
        compte compte = new compte(1009238490, 100);
        compte.Ajouter(150);
        compte.retier(100);

        System.out.println(compte.Afficher());

    }
}
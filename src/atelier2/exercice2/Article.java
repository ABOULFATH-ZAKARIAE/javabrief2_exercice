package exercice2;

public class Article {
	private String nom;
	private double prix;
	

	public Article() {
		
	}
	public Article(String nom , double prix) {
		this.nom = nom;
		this.setPrix(prix);
	}
	
	public void afficher() {
		System.out.println("le Nom de Article est "+ this.nom + " de prix de l'article " + this.getPrix() +" DH \n");
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}



}

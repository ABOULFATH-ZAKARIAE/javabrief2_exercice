package exercice2;



public class ArticleEnSolde extends Article{


	private double pourcentage ;
	private double prixorigine;
	
	
	
   public ArticleEnSolde() {
		
	}
	public ArticleEnSolde(String nom,double prix,double pourcentage , double prixorigine) {
		super(nom, prix);
		this.pourcentage = pourcentage;
		this.prixorigine = prixorigine;
	}
	
	public double pourcentage() {
		return  this.getPrix() * pourcentage/100;
	}
	
	public double prixorigine(){
		return this.getPrix() - pourcentage() ;
	}
	
	public void afficher() {
		System.out.println(" le poucentage de reduction " + pourcentage() + " et prix d'origin "+prixorigine());
	}
}

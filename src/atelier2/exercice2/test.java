package exercice2;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Article show = new Article("Cart PSN", 100);
		
		show.afficher();
		
		
		
		ArticleEnSolde shows = new ArticleEnSolde("Cart PSN", 100, 10, 500);
		shows.afficher();
	}
}

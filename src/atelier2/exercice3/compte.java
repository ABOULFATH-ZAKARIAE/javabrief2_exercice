package exercice3;

public class compte {
	  private long numCompte;
	    private double Solde;

	    private double soldeRetirer;
	    private double soldeAjouter;
	    
	    private double intererAnuelle;

	    public compte(long numcompte, double Solde) {
	        this.numCompte = numcompte;
	        this.Solde = Solde;
	    }

	    public double Ajouter(double newSolde) {
	        return this.soldeAjouter = this.Solde + newSolde;
	    }
	    public double retier(double retirer) {
	    	if(this.soldeAjouter > 200) {
	    		return this.soldeRetirer = soldeAjouter - retirer;
	    	}
	    	else {
	    		return this.soldeRetirer = soldeAjouter;
	    	}
	    }


	    public double intererAnuelle() {
	    	this.intererAnuelle = 200 + this.soldeAjouter*0.07;
	    	return this.intererAnuelle;
	    }

	    public String Afficher() {
	    	if(this.soldeAjouter > 200) {
	            return "Hello your account number " + this.numCompte + " , and your balance after adding " + this.soldeAjouter + 
	                    ", and your sold after withdrawing and " + this.soldeRetirer + " \n est votre interer annuelle :" + intererAnuelle() + "\n";
	    	}
	    	else {
	            return "Hello your account number " + this.numCompte + " , et votre solde apres ajouter " + this.soldeAjouter + 
	                    ", et votre sold apres retirer et " + this.soldeRetirer +  " \n est votre interer annuelle :" + intererAnuelle() +
	                    " \n ---------------- Warning ----------------- \n" +
	                    "votre solde et < 200 alor tu as pas le droit de retier un solde";
	    	}
	    }
}

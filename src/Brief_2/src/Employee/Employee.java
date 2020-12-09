package Employee;

public abstract class  Employee {
	private String nom;
	private String prenom;
	
	public Employee(String nom,String prenom){
		super();
		this.nom = nom;
		this.prenom = prenom; 
	}
	
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String toString() {
		return " Nom de Employee = " + nom + " prenomde Employee = " + prenom ;
	}

	public abstract void afficherEmployee();

	
}

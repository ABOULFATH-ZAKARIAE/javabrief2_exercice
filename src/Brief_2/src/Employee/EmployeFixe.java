package Employee;

public class EmployeFixe extends Employee {
	
	private double salaire;
	
	public EmployeFixe(String nom,String prenom,double salaire) {
		super(nom,prenom);
		this.salaire = salaire;
	}
	@Override
	public String toString() {
		return super.toString()+" Salaire est = "+salaire + " DH";	
	}
	@Override
	public void afficherEmployee() {
		// TODO Auto-generated method stub
		System.out.println(toString());
		
	}
		
}

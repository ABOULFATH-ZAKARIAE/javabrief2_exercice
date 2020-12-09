package Employee;

public class EmployeCommission extends Employee {
	private double salaire, ventes;
	private int commission;
	
	public EmployeCommission(String nom, String prenom, double salaire, double ventes, int commission) {
		super(nom, prenom);
		this.salaire = salaire;
		this.ventes = ventes;
		this.commission = commission;
	}
	
	public double calculdeSalaire() {
		return salaire + (ventes * commission);
	}
	
	public String toString() {
		return super.toString() + " Salaire est =" + calculdeSalaire() + " DH";
	}

	@Override
	public void afficherEmployee() {
		System.out.println(toString());
	}

}

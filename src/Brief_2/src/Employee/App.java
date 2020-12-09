package Employee;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Nom/preom/salaire
		EmployeFixe F = new EmployeFixe("Yassine", "Cherkaoui", 12000);
		//Nom/preom/salaire/ventes/commission
		EmployeCommission C =new EmployeCommission("Yassine2", "Cherkaoui2", 10000, 1000, 50);

		
		
		//AFFECHGE
		F.afficherEmployee();
		C.afficherEmployee();

		
		
	}

}

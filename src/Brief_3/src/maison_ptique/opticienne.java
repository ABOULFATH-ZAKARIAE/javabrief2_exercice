package maison_ptique;

public class opticienne extends Personne {

	public opticienne(String nom,int age) {
		super(nom, age);
	}
	
	
	public String toString() {
		return super.toString() +" ans" +" et je travaille en tant que opticienne !";
	}
	
	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		System.out.println(toString());
	}

}

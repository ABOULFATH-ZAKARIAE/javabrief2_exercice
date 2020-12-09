package maison_ptique;


public class Medcine extends Personne {

	public Medcine(String nom,int age) {
		super(nom, age);
	}
	
	public String toString() {
		return super.toString() +" ans "+" et je travaille en tant que médecin!";
	}
	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		System.out.println(toString());
	}

}

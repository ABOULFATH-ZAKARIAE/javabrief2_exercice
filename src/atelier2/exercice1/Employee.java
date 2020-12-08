package exercice1;

import java.util.Calendar;

public class Employee {
	private String nom;
	private String prenom;
	private String adress;
	private int anneeNaissance;
	private int anneeEncours;
	private int age;
	
	public Employee(String nom, String prenom, String adress,int anneeNaissance) {
	      this.nom = nom;
	      this.prenom = prenom;
	      this.adress = adress;
	      this.anneeNaissance = anneeNaissance;
	      
	   }
	public Employee(String nom, String prenom,int anneeNaissance) {
	      this.nom = nom;
	      this.prenom = prenom;
	      this.anneeNaissance = anneeNaissance;
	      
	   }
	
	   public void emploiyee() {

			Calendar c = Calendar.getInstance();
			 int year = c.get(Calendar.YEAR);
			 age = year-anneeNaissance;
			 anneeEncours=year;
			 if (this.adress!=null) {
				
			
		      System.out.println(this.nom + " " + this.prenom+ " ,né le " + this.anneeNaissance+ " habitant à "+ this.adress+ " ,"+age+" ans ");
			 }else {
				System.out.println(this.nom + " " + this.prenom+ " ,né le " + this.anneeNaissance+ " ,"+age+" ans ");
			}
		      
		   }
	
//nom
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getage() {
		return age;
	}

	public void setage(int age) {
		this.age = age;
	}
//prenom
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
//adress
	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
//annerd naissance
	public int getAnneeNaissance() {
		return anneeNaissance;
	}

	public void setAnneeNaissance(int anneeNaissance) {
		this.anneeNaissance = anneeNaissance;
	}
//annerenvours
	public int getAnneeEncours() {
		return anneeEncours;
	}

	public void setAnneeEncours(int anneeEncours) {
		this.anneeEncours = anneeEncours;
	}
}

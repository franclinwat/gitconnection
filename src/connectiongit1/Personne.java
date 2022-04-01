package connectiongit1;

public class Personne {

	private String nom;
	private int age;
	
	
	public Personne (String nom, int age ) {
		this.nom=nom;
		this.age=age;
	}
	
	public void SetNom(String nom) {
		this.nom=nom;
	}
	
	public String GetNom() {
		
		return nom;
	}
	
	public void SetAge(String age) {
		this.nom=age;
	}
	
	public int GetAge() {
		
		return age;
	}
	
	
	 
}

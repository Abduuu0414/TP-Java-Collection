package ma.projet;

public class Personne {
	protected int id;
	protected String nom;
	protected String prenom;
	protected String email;
	protected String telephone;
	protected double salaire;
	
	private static int comp;
	
	public Personne(String nom, String prenom, String email, String telephone, double salaire) {
		this.id = ++comp;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.salaire = salaire;
	}

	public int getId() {
		return id;
	}



	public String getNom() {
		return nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public String getEmail() {
		return email;
	}



	public String getTelephone() {
		return telephone;
	}



	public double getSalaire() {
		return salaire;
	}



	public void setId(int id) {
		this.id = id;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}



	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}



	public double calculerSalaire() {
		return this.salaire;
	}

	public void afficher() {
		System.out.println("ID: " + id + ", Nom: " + nom + ", Prénom: " + prenom + ", Email: " + email);
	}
}

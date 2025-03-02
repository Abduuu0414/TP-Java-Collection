package ma.projet;


public class Utilisateur extends Personne {
	private String login;
    private String password;
    private String service;
    private Profile profile;


	public Utilisateur(String nom, String prenom, String email, String telephone, double salaire, String login,
			String password, String service, Profile profile) {
		super(nom, prenom, email, telephone, salaire);
		this.login = login;
		this.password = password;
		this.service = service;
		this.profile = profile;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	public String getService() {
		return service;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setService(String service) {
		this.service = service;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}
    
    
}

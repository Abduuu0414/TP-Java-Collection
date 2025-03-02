package ma.projet;

public class Profile {
	private int id;
	private String code;
	private String libelle;

	
	static int comp;
	
	public Profile(String code, String libelle) {
		this.id = ++comp;
		this.code = code;
		this.libelle = libelle;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public String getLibelle() {
		return libelle;
	}


	public void setCode(String code) {
		this.code = code;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


}

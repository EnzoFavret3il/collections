package Association;

public class FicheAnnuaire {
	private String nom;
	private String Adresse;
	private String Numero;
	public FicheAnnuaire(String nom, String adresse, String numero) {
		super();
		this.nom = nom;
		Adresse = adresse;
		Numero = numero;
	}
	public String getNom() {
		return nom;
	}
	public String getAdresse() {
		return Adresse;
	}
	public String getNumero() {
		return Numero;
	}
	
}

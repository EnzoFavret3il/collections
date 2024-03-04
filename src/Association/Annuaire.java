package Association;
import java.util.* ;
import java.util.Map.Entry;


public class Annuaire {

	HashMap<String, FicheAnnuaire> annuaire; 
	
	public Annuaire() {
		annuaire = new HashMap();
	}
	
	public void ajouterFicher(String nom, FicheAnnuaire fiche) {
		annuaire.put(nom, fiche);
	}
	public FicheAnnuaire getFiche(String nom){
		
		return annuaire.get(nom);
		
	}
	
	public void afficherToutesLesFiches() {
		StringBuilder sb = new StringBuilder();
		for(Entry<String, FicheAnnuaire> entry : annuaire.entrySet()) {
			sb.append(entry.getKey())
			.append(":\n")
			.append(entry.getValue())
			.append('\n')
			.append('\n');
		}
		System.out.println(sb);
	}
}

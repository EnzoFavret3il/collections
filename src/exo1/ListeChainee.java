package exo1;

public class ListeChainee<Z> {
	private Noeud<Z> premier;
	private int taille;
	
	public int taille() {
		return taille;
	}
	
	
	public Z get(int idx) {
		if(idx<0 || idx>=taille) throw new IndexOutOfBoundsException(idx);
		
		Noeud<Z> courant=premier;
		for(int i=0;i<idx;i++) {
			courant=courant.getSuivant();
			}
		return courant.getElements();
		
	}
	public void ajouter(Z element) {
		premier=new Noeud<Z>(element, premier);
		taille++;
	}
	public void ajouterFin(Noeud<Z> dernier2) {
		Noeud<Z> dernier=premier;
		if(premier!=null) {
		while(dernier.getSuivant()!=null) {
			dernier=dernier.getSuivant();
			dernier.setSuivant(new Noeud(dernier2, null));
			}
		
		taille++;
		}
		else {
			ajouterFin(dernier);
		}
	}
	
	
}

package exo1;

public class ListeTableau<T> {
	private Object[] tab;
	private int taille;
	private static final int TAILLE_DEFAUT=10;
	
	ListeTableau(Object[] tab, int taille){
		this.tab=new Object[TAILLE_DEFAUT];
		this.taille=0;
	}
	public int taille() {
		return taille;
	}
	
	
	public void ajouter(Object element) {
		
	}
} 
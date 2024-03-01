package exo1;

public class ListeTableau<T> {
	private Object[] tab;
	private int taille;
	private static final int TAILLE_DEFAUT=10;
	
	ListeTableau(int taille){
		this.tab=new Object[taille];
		this.taille=taille;
	}
	public int taille() {
		return taille;
	}
	
	public ListeTableau() {
		this(TAILLE_DEFAUT);
	}
	
	public void ajouter(T element) {
		verifierTaille();
		tab[taille++] = element;
	}
	
	public T get(int index) {
		if(index < 0 || index>=taille)
			throw new IndexOutOfBoundsException(index);
		return (T) tab[index];
	}
	public void verifierTaille() {
		if(taille==tab.length) {
			Object[]tmp = new Object[2*taille];
			for(int i = 0 ; i<taille;i++) {
				tmp[i]=tab[i];
			}
			tab=tmp;
		}
	}
} 
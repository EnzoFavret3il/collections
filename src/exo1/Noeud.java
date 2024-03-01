package exo1;
import java.util.LinkedList;
import java.util.*;

public class Noeud<R> {
	R elements;
	Noeud<R> suivant;
	public Noeud(R elements, Noeud<R> suivant) {
		super();
		this.elements = elements;
		this.suivant = suivant;
	}
	public R getElements() {
		return elements;
	}
	public Noeud<R> getSuivant() {
		return suivant;
	}
	public void setSuivant(Noeud<R> suivant) {
		this.suivant = suivant;
	}
	
}

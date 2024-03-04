package liste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListeTriee {
    private List<String> listeTriee;

    public ListeTriee() {
        listeTriee = new ArrayList<>();
    }

    // Méthode pour ajouter un nouvel élément à la liste tout en maintenant l'ordre
    public void ajoute(String element) {
        listeTriee.add(element);
        Collections.sort(listeTriee); // Trie la liste après l'ajout
    }

    // Méthode pour afficher les éléments de la liste
    public void affiche() {
        for (String element : listeTriee) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        ListeTriee liste = new ListeTriee();
        liste.ajoute("orange");
        liste.ajoute("banane");
        liste.ajoute("pomme");
        liste.ajoute("fraise");

        liste.affiche();
    }
}

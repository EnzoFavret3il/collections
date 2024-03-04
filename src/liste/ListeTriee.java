package liste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListeTriee {
    private List<String> listeTriee;

    public ListeTriee() {
        listeTriee = new ArrayList<>();
    }


    public void ajoute(String element) {
        listeTriee.add(element);
        Collections.sort(listeTriee); 
        }

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

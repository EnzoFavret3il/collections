import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cercle {
    private int x, y;
    double rayon;

    public Cercle(int x, int y, double rayon) {
        this.x = x;
        this.y = y;
        this.rayon = rayon;
    }

    public void affiche() {
        System.out.println("Coordonnées : " + x + ", " + y + " ; rayon : " + rayon);
    }

    public double getRayon() {
        return rayon;
    }

    public int getX() {
        return x;
    }
}

public class Main {
    public static void main(String[] args) {
        // Création d'une liste de Cercles
        ArrayList<Cercle> cercles = new ArrayList<>();
        cercles.add(new Cercle(3, 4, 5.0));
        cercles.add(new Cercle(1, 2, 3.0));
        cercles.add(new Cercle(6, 7, 2.0));

        // Trier les cercles selon les valeurs croissantes de leur rayon
        Collections.sort(cercles, new Comparator<Cercle>() {
            public int compare(Cercle c1, Cercle c2) {
                return Double.compare(c1.getRayon(), c2.getRayon());
            }
        });

        // Affichage des cercles triés par rayon
        System.out.println("Triage par rayon :");
        for (Cercle cercle : cercles) {
            cercle.affiche();
        }

        // Trier les cercles selon les valeurs croissantes de leur abscisse
        Collections.sort(cercles, new Comparator<Cercle>() {
            public int compare(Cercle c1, Cercle c2) {
                return Integer.compare(c1.getX(), c2.getX());
            }
        });

        // Affichage des cercles triés par abscisse
        System.out.println("\nTriage par abscisse :");
        for (Cercle cercle : cercles) {
            cercle.affiche();
        }
    }
}

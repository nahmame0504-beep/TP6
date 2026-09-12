package com.example.tp;

/**
 * Gestionnaire de médias stockant les éléments dans un tableau dynamique.
 */
public class MediaLibrary {
    private Media[] items = new Media[4];
    private int count = 0;

    /**
     * Ajoute un média et redimensionne le tableau si nécessaire.
     */
    public void add(Media m) {
        if (count == items.length) {
            Media[] tmp = new Media[items.length * 2];
            System.arraycopy(items, 0, tmp, 0, items.length);
            items = tmp;
        }
        items[count++] = m;
    }

    /**
     * Joue tous les médias de la bibliothèque via polymorphisme.
     */
    public void playAll() {
        System.out.println("=== Lecture de la bibliothèque ===");
        for (int i = 0; i < count; i++) {
            items[i].lire();
        }
    }

    /**
     * Calcule la durée totale cumulée (en ignorant les flux à durée indéterminée -1).
     */
    public int totalDuration() {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            int d = items[i].getDuree();
            if (d > 0) {
                sum += d;
            }
        }
        return sum;
    }
}
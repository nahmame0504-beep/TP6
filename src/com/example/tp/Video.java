package com.example.tp;

/**
 * Classe représentant une vidéo avec une durée et une résolution.
 */
public class Video extends Media {
    private int duree;        // en secondes
    private String resolution;

    public Video(String titre, int duree, String resolution) {
        super(titre);
        this.duree = duree;
        this.resolution = resolution;
    }

    @Override
    public void lire() {
        System.out.println("Lecture vidéo : " + titre + " [" + resolution + "]");
    }

    @Override
    public int getDuree() {
        return duree;
    }
}
package com.example.tp;

/**
 * Classe représentant un flux en direct (durée indéterminée).
 */
public class LiveStream extends Media {
    private String url;

    public LiveStream(String titre, String url) {
        super(titre);
        this.url = url;
    }

    @Override
    public void lire() {
        System.out.println("Démarrage du flux en direct : " + titre + " – " + url);
    }

    /**
     * Durée non déterminée pour un flux en direct.
     */
    @Override
    public int getDuree() {
        return -1;
    }
}
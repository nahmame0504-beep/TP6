package ma.projet;

import java.util.List;

public class Utils {

    /**
     * Liste toute liste d'objets Personne ou de ses sous-classes (bounded wildcard).
     * @param personnes liste de Personne
     */
    public static void listerPersonnes(List<? extends Personne> personnes) {
        for (Personne p : personnes) {
            p.affiche();
        }
    }
}
package fr.solid.solid.L;

import java.util.Arrays;
import java.util.List;

public interface LivraisonB {
    double calculerFrais(double poids, double distance);
}

// Nouvelle interface pour les livraisons avec suivi
interface LivraisonSuivie {
    void obtenirCodeSuivi();
}

class LivraisonStandard implements LivraisonB, LivraisonSuivie {
    @Override
    public double calculerFrais(double poids, double distance) {
        return 5.0 + 0.1 * distance + 0.05 * poids;
    }

    @Override
    public void obtenirCodeSuivi() {
        System.out.println("Code de suivi : code-Standard");
    }
}

class LivraisonExpress implements LivraisonB, LivraisonSuivie {
    @Override
    public double calculerFrais(double poids, double distance) {
        return 10.0 + 0.2 * distance + 0.1 * poids;
    }

    @Override
    public void obtenirCodeSuivi() {
        System.out.println("Code de suivi : code-Express");
    }
}

class LivraisonInternationale implements LivraisonB {
    @Override
    public double calculerFrais(double poids, double distance) {
        return 20.0 + 0.3 * distance + 0.2 * poids + 15.0; // Supplément pour les douanes
    }
    // Pas d'implémentation de suivi, donc pas de méthode obtenirCodeSuivi()
}

class Main {
    public static void main(String[] args) {
        List<LivraisonB> livraisons = Arrays.asList(
                new LivraisonStandard(),
                new LivraisonExpress(),
                new LivraisonInternationale()
        );

        livraisons.forEach(livraison -> {
            System.out.println(livraison.calculerFrais(14d, 47d));
            if (livraison instanceof LivraisonSuivie) {
                ((LivraisonSuivie) livraison).obtenirCodeSuivi();
            }
        });




    }
}

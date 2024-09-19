package fr.solid.solid.L;

import java.util.Arrays;
import java.util.List;

public interface LivraisonM {
    double calculerFrais(double poids, double distance);

    void obtenirCodeSuivi();
}

class LivraisonStandardM implements LivraisonM {
    @Override
    public double calculerFrais(double poids, double distance) {
        return 5.0 + 0.1 * distance + 0.05 * poids;
    }

    @Override
    public void  obtenirCodeSuivi() {
        System.out.println("code-Standard");
    }
}

class LivraisonExpressM implements LivraisonM {
    @Override
    public double calculerFrais(double poids, double distance) {
        return 10.0 + 0.2 * distance + 0.1 * poids;
    }

    @Override
    public void obtenirCodeSuivi() {
        System.out.println("code-Express");
    }
}

class LivraisonInternationaleM implements LivraisonM {
    @Override
    public double calculerFrais(double poids, double distance) {
        return 20.0 + 0.3 * distance + 0.2 * poids + 15.0; // Supplément pour les douanes
    }

    @Override
    public void obtenirCodeSuivi() {
        throw new UnsupportedOperationException("Le suivi n'est pas disponible pour les livraisons internationales.");
    }
}

class Application {
    public static void main(String[] args) {



        List<LivraisonM> livraisons = Arrays.asList(
                new LivraisonStandardM(),
                new LivraisonExpressM(),
                new LivraisonInternationaleM()
        );

        livraisons.forEach(livraison -> {
            System.out.println(livraison.calculerFrais(14d, 47d));
            livraison.obtenirCodeSuivi();
        });


    }
}

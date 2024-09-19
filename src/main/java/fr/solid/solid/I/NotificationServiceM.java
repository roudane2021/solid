package fr.solid.solid.I;

public interface NotificationServiceM {
    void envoyerMessage(String message);
    void envoyerPieceJointe(String cheminFichier);
}

class NotificationEmail implements NotificationServiceM {
    @Override
    public void envoyerMessage(String message) {
        System.out.println("Envoi d'un email : " + message);
    }

    @Override
    public void envoyerPieceJointe(String cheminFichier) {
        System.out.println("Envoi d'une pièce jointe par email : " + cheminFichier);
    }
}

class NotificationSMS implements NotificationServiceM {
    @Override
    public void envoyerMessage(String message) {
        System.out.println("Envoi d'un SMS : " + message);
    }

    @Override
    public void envoyerPieceJointe(String cheminFichier) {
        // Le SMS ne peut pas envoyer de pièces jointes, mais la méthode doit être implémentée.

    }
}

class NotificationPush implements NotificationServiceM {
    @Override
    public void envoyerMessage(String message) {
        System.out.println("Envoi d'une notification push : " + message);
    }

    @Override
    public void envoyerPieceJointe(String cheminFichier) {
        // Les notifications push ne supportent pas les pièces jointes.

    }
}

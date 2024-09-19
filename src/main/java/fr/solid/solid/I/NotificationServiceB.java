package fr.solid.solid.I;

public interface NotificationServiceB {
    void envoyerMessage(String message);
}

interface NotificationAvecPieceJointe extends NotificationServiceB {
    void envoyerPieceJointe(String cheminFichier);
}

class NotificationEmailB implements NotificationAvecPieceJointe {
    @Override
    public void envoyerMessage(String message) {
        System.out.println("Envoi d'un email : " + message);
    }

    @Override
    public void envoyerPieceJointe(String cheminFichier) {
        System.out.println("Envoi d'une pièce jointe par email : " + cheminFichier);
    }
}

class NotificationSMSB implements NotificationServiceB {
    @Override
    public void envoyerMessage(String message) {
        System.out.println("Envoi d'un SMS : " + message);
    }
}

class NotificationPushB implements NotificationServiceB {
    @Override
    public void envoyerMessage(String message) {
        System.out.println("Envoi d'une notification push : " + message);
    }
}
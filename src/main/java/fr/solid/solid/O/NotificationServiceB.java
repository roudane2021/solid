package fr.solid.solid.O;

public interface NotificationServiceB {
    void envoyerNotification(String message);
}

class NotificationEmail implements NotificationServiceB {
    @Override
    public void envoyerNotification(String message) {
        // Logique d'envoi d'email
        System.out.println("Envoi de l'email : " + message);
    }
}

class NotificationSMS implements NotificationServiceB {
    @Override
    public void envoyerNotification(String message) {
        // Logique d'envoi de SMS
        System.out.println("Envoi du SMS : " + message);
    }
}



package fr.solid.solid.O;

import java.util.Objects;

public class NotificationServiceM {

    public void envoyerNotification(String type, String message) {
        // Logique d'envoi d'email
        if (Objects.equals("email", type)) {
            System.out.println("Envoi de l'email : " + message);
        }
        else if (Objects.equals("sms", type)) {
            System.out.println("Envoi du SMS : " + message);
        }

        else {
            throw new IllegalArgumentException("Error !!");
        }

    }
}

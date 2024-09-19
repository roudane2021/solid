package fr.solid.solid.S;

import fr.solid.solid.S.utils.User;
import fr.solid.solid.S.utils.UserRepository;
import org.springframework.stereotype.Service;


public class UserServiceB implements UserService{

    private UserRepository userRepository;


    private EmailService emailService;

    @Override
    public User createUser(User user) {
        // Logique métier pour créer un utilisateur
        User savedUser = userRepository.save(user);

        // Déléguer l'envoi de l'email à EmailService
        emailService.sendWelcomeEmail(savedUser);

        return savedUser;
    }

    @Override
    public void updateUser(User user) {
        // Logique métier pour mettre à jour un utilisateur
        userRepository.save(user);
    }

    @Override
    public void deleteUser(Long userId) {
        // Logique métier pour supprimer un utilisateur
        userRepository.deleteById(userId);
    }
}
interface IEmailService {
    void sendWelcomeEmail(User user);
}
@Service
class EmailService implements IEmailService{

    // Logique d'envoi d'emails
    public void sendWelcomeEmail(User user) {
        // Code pour envoyer un email de bienvenue
    }

    // Autres méthodes liées à l'envoi d'emails...
}
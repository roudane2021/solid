package fr.solid.solid.S;

import fr.solid.solid.S.utils.User;
import fr.solid.solid.S.utils.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceM implements UserService{


    private UserRepository userRepository;



    @Override
    public User createUser(User user) {
        // Logique métier pour créer un utilisateur
        User savedUser = userRepository.save(user);

        // Envoyer un email de bienvenue
        sendEmail(user);

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

    private void sendEmail(User user) {
        // Envoyer un email
    }
}

package fr.solid.solid.S;

import fr.solid.solid.S.utils.User;

public interface UserService {

    public User createUser(User user);

    public void updateUser(User user);

    public void deleteUser(Long userId);
}

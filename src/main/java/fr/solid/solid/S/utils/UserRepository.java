package fr.solid.solid.S.utils;



public interface UserRepository  {
   User save(User user);
   void deleteById(Long id);
}

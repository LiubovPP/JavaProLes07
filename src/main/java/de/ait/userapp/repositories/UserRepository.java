package de.ait.userapp.repositories;

import de.ait.userapp.models.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository {

    List<User> findAll();
    Optional<User> findById(Long id);
    User save(User user);

    void deleteById(Long id);

    void updateUserById(Long id, User user);

}

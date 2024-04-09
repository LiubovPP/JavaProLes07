package de.ait.userapp.repositories;

import de.ait.userapp.models.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class UserRepositoryImpl implements UserRepository{
    private List<User> users = List.of(new User(1L, "Alice", "pass123", "alice@example.com", 30),
            new User(2L, "Bob", "bobpass", "bob@example.com", 25),
            new User(3L, "Charlie", "charliepass", "charlie@example.com", 35));
    @Override
    public List<User> findAll() {
        return users;
    }
}

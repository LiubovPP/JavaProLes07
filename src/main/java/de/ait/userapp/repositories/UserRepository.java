package de.ait.userapp.repositories;

import de.ait.userapp.models.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepository {

    List<User> findAll();
}

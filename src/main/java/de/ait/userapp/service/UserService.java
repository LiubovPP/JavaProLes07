package de.ait.userapp.service;

import de.ait.userapp.models.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    List<User> getAllUsers();

    User getUserById(Long id);
}

package de.ait.userapp.service;

import de.ait.userapp.dto.UserResponseDTO;
import de.ait.userapp.models.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    List<UserResponseDTO> getAllUsers();

    List<UserResponseDTO> getAllUsers(int age);

    User getUserById(Long id);

    User addUser(User user);

    void deleteById(Long id);

    void updateUserById(Long id, User user);
}

package de.ait.userapp.сontrollers;

import de.ait.userapp.models.User;
import de.ait.userapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    //GET users
    @GetMapping("/users")
    public List<User> getAllUsers() {

        return userService.getAllUsers();
    }
    //GET users{userID}
    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }
}

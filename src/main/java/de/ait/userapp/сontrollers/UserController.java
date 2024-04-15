package de.ait.userapp.сontrollers;

import de.ait.userapp.dto.UserResponseDTO;
import de.ait.userapp.models.User;
import de.ait.userapp.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
@Tags(value = {@Tag(name = "Пользователи", description = "Операции с пользователями"),
@Tag(name = "Users", description = "Users operation")})

public class UserController {
    private final UserService userService;

    @Operation (summary = "Получение списка пользователей", description = "Список всех пользователей. Доступно администратору")
    //GET users

    @GetMapping
    //@GetMapping("/users")

    public List<UserResponseDTO> getAllUsers(@RequestParam(required = false, defaultValue = "0") int age,
                                             @RequestParam(required = false) String name) {

        return userService.getAllUsers();
    }

    //GET users{userID}
   // @GetMapping("/users/{id}")
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    //@PostMapping("/users")
    @PostMapping()
    public void addNewUser(@RequestBody User user) {
        userService.addUser(user);
    }

    //@DeleteMapping("/users/{id}")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        userService.deleteById(id);
    }

    //@PutMapping("/user/{id}")
    @PutMapping("/{id}")
    public void updateUserById(@PathVariable Long id,
                               @RequestBody User user) {
        userService.updateUserById (id, user);
    }

}

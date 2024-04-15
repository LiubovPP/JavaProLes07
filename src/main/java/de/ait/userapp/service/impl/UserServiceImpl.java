package de.ait.userapp.service.impl;

import de.ait.userapp.dto.UserResponseDTO;
import de.ait.userapp.models.User;
import de.ait.userapp.repositories.UserRepository;
import de.ait.userapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

 private final UserRepository userRepository;
 private final ModelMapper modelMapper;


    @Override
    public List<UserResponseDTO> getAllUsers() {
        return UserResponseDTO.from(userRepository.findAll());
    }

    @Override
    public List<UserResponseDTO> getAllUsers (int age) {
        if(age==0) {
            return getAllUsers();
        } else {
            return  UserResponseDTO.from(userRepository.findAll()).stream().filter(u->u.getAge()==age).collect(Collectors.toList());
        }
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findAll()
                .stream().filter(user -> user.getId().equals(id)).findAny().get();
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public void updateUserById(Long id, User user) {
        userRepository.updateUserById(id, user);
    }


}

package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;

import java.security.Principal;
import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User addUser(User user);

    void deleteUserById(Long id, Principal principal);

    User updateUserById(Long id, User user);

    User getById(Long id);

    User getByEmail(String email);

    void addUserAtStartup(User user);
}

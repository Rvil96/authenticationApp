package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    List<User> getAllUsers();

    User getUserById(long id);

    void updateUserById(long id, User updatedUser);

    void removeUserById(long id);

    boolean emailExist(String email);
}

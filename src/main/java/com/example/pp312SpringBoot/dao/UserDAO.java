package com.example.pp312SpringBoot.dao;

import java.util.List;
import com.example.pp312SpringBoot.model.User;

public interface UserDAO {

    List<User> getAllUsers();

    User getUserById(int id);

    void saveUser(User user);

    void delete(int id);

    void updateUser(int id, User updateUser);
}

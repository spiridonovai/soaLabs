package com.example.soa.service;

import java.util.List;

import com.example.soa.model.User;


public interface UserService {

    User findById(long id);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserById(long id);

    void deleteAllUsers();
}

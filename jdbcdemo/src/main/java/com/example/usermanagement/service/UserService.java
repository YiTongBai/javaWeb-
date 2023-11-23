package com.example.usermanagement.service;

import com.example.usermanagement.dao.UserDao;
import com.example.usermanagement.model.User;
import java.util.List;

public class UserService {
    private UserDao userDao = new UserDao();

    public void addUser(User user) {
        userDao.addUser(user);
    }

    public List<User> getAllUsers() {
        return userDao.getUsers();
    }
}

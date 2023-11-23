package com.example.usermanagement;

import com.example.usermanagement.model.User;
import com.example.usermanagement.service.UserService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();

        // 添加用户
        userService.addUser(new User(2, "Alice123", "alice@example.com"));

        // 获取并打印所有用户
        List<User> users = userService.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }
}

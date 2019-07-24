package com.stackroute.userservice.Service;

import com.stackroute.userservice.Domain.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);
    List<User> getAllUsers();

}

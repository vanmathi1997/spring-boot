package com.stackroute.userservice.Service;

import com.stackroute.userservice.Domain.User;
import com.stackroute.userservice.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class UserServiceImpl implements UserService {
    UserRepository userRepository;
    @Autowired
    public UserServiceImpl(UserRepository userRepository)
    {
        this.userRepository=userRepository;
    }
    @Override
    public User saveUser(User user) {
        return userRepository.save(user) ;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}

package com.shahriar.maad.api.services.impl;

import com.shahriar.maad.api.entities.User;
import com.shahriar.maad.api.repositories.UserRepository;
import com.shahriar.maad.api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public User crateUser(User user) {

        User savedUser = userRepository.save(user);
        return savedUser;
    }

    @Override
    public User deleteUser(Integer userId) {
        return null;
    }

    @Override
    public User updateUser(User user, Integer userId) {
        return null;
    }

    @Override
    public List<User> getAllUser() {
        return null;
    }
}

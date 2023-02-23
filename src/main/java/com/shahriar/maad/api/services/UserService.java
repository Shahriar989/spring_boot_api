package com.shahriar.maad.api.services;

import com.shahriar.maad.api.entities.User;
import java.util.List;

public interface UserService {

    User crateUser(User user);
    User deleteUser(Integer userId);
    User updateUser(User user, Integer userId);
    List<User> getAllUser();
}

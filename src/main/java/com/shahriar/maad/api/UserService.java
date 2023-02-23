package com.shahriar.maad.api;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> userList;

    public UserService(){

        userList = new ArrayList<>();

        userList.add(new User(1,"SHAHRIAR","shahriar@gmail.com"));
        userList.add(new User(2,"SHAHRIAR","shahriar@gmail.com"));
        userList.add(new User(3,"SHAHRIAR","shahriar@gmail.com"));
        userList.add(new User(4,"SHAHRIAR","shahriar@gmail.com"));
        userList.add(new User(5,"SHAHRIAR","shahriar@gmail.com"));
        userList.add(new User(6,"SHAHRIAR","shahriar@gmail.com"));
        userList.add(new User(7,"SHAHRIAR","shahriar@gmail.com"));
        userList.add(new User(8,"SHAHRIAR","shahriar@gmail.com"));
        userList.add(new User(9,"SHAHRIAR","shahriar@gmail.com"));
        userList.add(new User(10,"SHAHRIAR","shahriar@gmail.com"));
        userList.add(new User(11,"SHAHRIAR","shahriar@gmail.com"));
        userList.add(new User(12,"SHAHRIAR","shahriar@gmail.com"));
        userList.add(new User(13,"SHAHRIAR","shahriar@gmail.com"));
        userList.add(new User(14,"SHAHRIAR","shahriar@gmail.com"));
        userList.add(new User(15,"SHAHRIAR","shahriar@gmail.com"));
        userList.add(new User(16,"SHAHRIAR","shahriar@gmail.com"));
        userList.add(new User(17,"SHAHRIAR","shahriar@gmail.com"));
        userList.add(new User(18,"SHAHRIAR","shahriar@gmail.com"));
        userList.add(new User(19,"SHAHRIAR","shahriar@gmail.com"));
        userList.add(new User(20,"SHAHRIAR","shahriar@gmail.com"));
    }

    public List<User> getUserList(){

        return userList;
    }
}

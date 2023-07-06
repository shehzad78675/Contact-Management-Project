package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    List<User> list = Arrays.asList(
            new User(1311L, "Shehzad Muhammad", "03022343567"),
            new User(1312L, "Anser Ali", "03098767897"),
            new User(1314L, "Hamza", "03324564672"));
    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}

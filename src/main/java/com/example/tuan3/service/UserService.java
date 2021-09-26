package com.example.tuan3.service;

import com.example.tuan3.authen.UserPrincipal;
import com.example.tuan3.entity.User;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}

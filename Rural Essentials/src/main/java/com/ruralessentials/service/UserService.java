package com.ruralessentials.service;

import com.ruralessentials.entity.User;

public interface UserService {
    User registerUser(User user);
    User getUserByEmail(String email);
}

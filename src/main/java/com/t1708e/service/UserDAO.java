package com.t1708e.service;

import com.t1708e.entity.User;

public interface UserDAO {
    boolean save(User user);

    User getUserById(String id);
}

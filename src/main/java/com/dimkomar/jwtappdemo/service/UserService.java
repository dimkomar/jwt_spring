package com.dimkomar.jwtappdemo.service;

import com.dimkomar.jwtappdemo.model.User;

import java.util.List;

public interface UserService {

    User register(User user);

    List<User> getAll();

    User finByUserName(String username);

    User findById(Long id);

    void delete(Long id);

}

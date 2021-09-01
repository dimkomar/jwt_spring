package com.dimkomar.jwtappdemo.repository;

import com.dimkomar.jwtappdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {
    //спринг сам вернет
    User findByUsername(String name);
}

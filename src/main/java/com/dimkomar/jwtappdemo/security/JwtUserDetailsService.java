package com.dimkomar.jwtappdemo.security;

import com.dimkomar.jwtappdemo.model.User;
import com.dimkomar.jwtappdemo.security.jwt.JwtUser;
import com.dimkomar.jwtappdemo.security.jwt.JwtUserFactory;
import com.dimkomar.jwtappdemo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class JwtUserDetailsService implements UserDetailsService {

    private final UserService userService;

    @Autowired
    public JwtUserDetailsService(UserService userService) {
        this.userService = userService;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.finByUserName(username);

        if(user == null){
            throw new UsernameNotFoundException("User with username: " + username + " not found");
        }

        JwtUser jwtUser = JwtUserFactory.create(user);
        log.info("IN loadByUserName - user with userName: {} successfully loaded", username);
        return jwtUser;

    }
}

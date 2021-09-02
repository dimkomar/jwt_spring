package com.dimkomar.jwtappdemo.security.jwt;

import com.dimkomar.jwtappdemo.model.Role;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JwtTokenProvider {

    public String createToken(String username, List<Role> role){

    }


    public Authentication getAuthentication(String token){

    }

    public String getUsername(String token){

    }

    public boolean validateToken(String token){

    }

    private List<String> getRoleNames(List<Role> userRoles){
        List<String> result = new ArrayList<>();

        userRoles.forEach(role -> {
            result.add(role.getName());
        });
        return  result;
    }


}

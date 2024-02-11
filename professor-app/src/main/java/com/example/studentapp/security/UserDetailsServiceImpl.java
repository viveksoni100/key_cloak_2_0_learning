/*
package com.example.studentapp.security;

import com.example.studentapp.entity.Roles;
import com.example.studentapp.entity.User;
import com.example.studentapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userService.getUserByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException("user not found!");
        }

        Set<SimpleGrantedAuthority> authorities = new HashSet<>();

        for (Roles role : user.getRoles()) {
            authorities.add(new SimpleGrantedAuthority(role.getRole()));
        }

        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), authorities);
    }
}
*/

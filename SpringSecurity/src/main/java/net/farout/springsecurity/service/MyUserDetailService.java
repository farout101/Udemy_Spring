package net.farout.springsecurity.service;

import net.farout.springsecurity.model.Users;
import net.farout.springsecurity.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Users users = repo.findByUsername(username);

        if(users == null) {
            System.out.println("User not found");
            throw new UsernameNotFoundException("User not found");
        }

        return null;
    }
}

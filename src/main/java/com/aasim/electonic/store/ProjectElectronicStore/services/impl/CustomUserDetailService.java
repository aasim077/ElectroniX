package com.aasim.electonic.store.ProjectElectronicStore.services.impl;

import com.aasim.electonic.store.ProjectElectronicStore.entities.User;
import com.aasim.electonic.store.ProjectElectronicStore.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //load the user form the Database
        User user = userRepository.findByEmail(username).
                orElseThrow(() -> new UsernameNotFoundException("User with given email id is  not found"));
        return user;


    }
}
//For any Query Contact : aasimahsan77@gmail.com
package com.loginregister.loginregisterspring.service;

import com.loginregister.loginregisterspring.model.User;
import com.loginregister.loginregisterspring.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


public interface UserService {
    User save(UserRegistrationDto registrationDto);

    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}

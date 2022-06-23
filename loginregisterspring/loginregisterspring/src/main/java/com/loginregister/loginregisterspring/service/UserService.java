package com.loginregister.loginregisterspring.service;

import com.loginregister.loginregisterspring.model.User;
import com.loginregister.loginregisterspring.web.dto.UserRegistrationDto;


public interface UserService {
    User save(UserRegistrationDto registrationDto);

}

package com.example.examportal.service;

import com.example.examportal.model.User;
import com.example.examportal.model.UserRole;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Set;

public interface UserService {

    //creating user
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;
    //get user by username
    public User getUser(String user);
    //delete user by userid
    public void deleteUser(Long userId);

}

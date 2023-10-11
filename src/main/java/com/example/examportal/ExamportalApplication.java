package com.example.examportal;

import com.example.examportal.model.Role;
import com.example.examportal.model.User;
import com.example.examportal.model.UserRole;
import com.example.examportal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamportalApplication implements CommandLineRunner {
@Autowired
    private UserService userService;
@Autowired
private BCryptPasswordEncoder bCryptPasswordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(ExamportalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("starting code");
//   User user= new User();
//  user.setFirstName("samir");
//  user.setLastName("karki");
//  user.setUsername("samir777");
//  user.setPassword(this.bCryptPasswordEncoder.encode("abc"));
//  user.setEmail("sam.777@gmail.com");
//  user.setProfile("default.png");
//        Role role =new Role();
//        role.setRoleId(9L);
//        role.setRoleName("ADMIN");
//        Set<UserRole> userRoleSet=new HashSet<>();
//        UserRole userRole=new UserRole();
//        userRole.setRole(role);
//        userRole.setUser(user);
//        userRoleSet.add(userRole);
//        User user1=this.userService.createUser(user,userRoleSet);
//        System.out.println(user1.getUsername());
//
//

    }
}

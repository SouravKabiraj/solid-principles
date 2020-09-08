package com.solid.services;

import com.solid.models.User;
import com.solid.repositories.UserRepository;

public class UserManagerImpl implements UserManager {
    UserRepository userRepository;

    UserManagerImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void logIn(String email, String password) {
        // Not Implemented
    }

    @Override
    public void signIn(String email, String name, String password) {
        try {
            userRepository.save(new User());  // User(email,name,password)
            sendEmail(email, "Hi " + name + ", Your profile created!");
        } catch (Exception e) {
            logError("signIn failed");
        }
    }

    private void logError(String text) {
        // Log error
    }

    private void sendEmail(String email, String content) {
        // Send Email
    }
}

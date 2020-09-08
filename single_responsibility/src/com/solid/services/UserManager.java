package com.solid.services;

public interface UserManager {
    void logIn(String email, String password);

    void signIn(String email, String name, String password);
}

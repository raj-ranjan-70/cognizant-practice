package com.example;

public class UserService {

    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void register(String username) {
        repository.save(username);
    }
}

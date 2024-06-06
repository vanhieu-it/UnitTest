package org.example;

public interface UserRepository {
    User findByEmail(String email);
    void save(User user);
}


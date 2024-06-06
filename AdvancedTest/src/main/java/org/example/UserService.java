package org.example;

public class UserService {
    private UserRepository userRepository;
    private EmailService emailService;

    public UserService(UserRepository userRepository, EmailService emailService) {
        this.userRepository = userRepository;
        this.emailService = emailService;
    }

    public void registerUser(String email, String password) {
        if (userRepository.findByEmail(email) != null) {
            throw new IllegalArgumentException("User already exists");
        }
        User user = new User(email, password);
        userRepository.save(user);
        emailService.sendWelcomeEmail(email);
    }
}


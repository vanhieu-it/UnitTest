import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.example.EmailService;
import org.example.User;
import org.example.UserRepository;
import org.example.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @Mock
    private EmailService emailService;

    @InjectMocks
    private UserService userService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testRegisterUser_UserDoesNotExist() {
        String email = "test@example.com";
        String password = "password123";

        when(userRepository.findByEmail(email)).thenReturn(null);

        userService.registerUser(email, password);

        verify(userRepository).save(any(User.class));
        verify(emailService).sendWelcomeEmail(email);
    }

    @Test
    public void testRegisterUser_UserAlreadyExists() {
        String email = "test@example.com";
        String password = "password123";
        User existingUser = new User(email, password);

        when(userRepository.findByEmail(email)).thenReturn(existingUser);

        assertThrows(IllegalArgumentException.class, () -> {
            userService.registerUser(email, password);
        });

        verify(userRepository, never()).save(any(User.class));
        verify(emailService, never()).sendWelcomeEmail(email);
    }
}

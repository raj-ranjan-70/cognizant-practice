package com.example;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    public void testSaveUser() {

        UserRepository repository = mock(UserRepository.class);

        UserService service = new UserService(repository);

        service.register("Raj");

        verify(repository).save("Raj");

        verify(repository).save(anyString());
    }
}

package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void testGreeting() {
        assertEquals("Hello World!", new App().getGreeting());
    }
}

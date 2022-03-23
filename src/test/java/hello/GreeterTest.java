package hello;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreeterTest {
    Greeter greeter;
    @BeforeEach
    void setUp() {
        greeter = new Greeter();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void sayHello() {
        assertEquals("Hello world!", greeter.sayHello());
    }
}
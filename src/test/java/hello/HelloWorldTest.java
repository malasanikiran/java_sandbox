package hello;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    HelloWorld helloWorld;

    @BeforeEach
    void init() {
        helloWorld = new HelloWorld();
    }

    @org.junit.jupiter.api.Test
    void reverseString() {
        String expected = "HELLO";
        assertEquals(expected, helloWorld.reverseString("OLLEH"));
        expected = "_A_B_C_";
        assertEquals(expected, helloWorld.reverseString("_C_B_A_"));


    }
}
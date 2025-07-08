package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldTest {
    
    @Test
    public void testGetGreeting() {
        HelloWorld helloWorld = new HelloWorld();
        String greeting = helloWorld.getGreeting();
        assertNotNull(greeting);
        assertTrue(greeting.contains("Hello"));
        assertTrue(greeting.contains("Google Guava SNAPSHOT dependency"));
    }
    
    @Test
    public void testSnapshotDependencyIntegration() {
        HelloWorld helloWorld = new HelloWorld();
        String greeting = helloWorld.getGreeting();
        assertNotNull(greeting, "Greeting should not be null when using snapshot dependency");
    }
}
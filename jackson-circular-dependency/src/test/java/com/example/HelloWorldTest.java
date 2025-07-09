package com.example;

public class HelloWorldTest {
    
    public static void main(String[] args) {
        HelloWorldTest test = new HelloWorldTest();
        test.testGetGreeting();
        System.out.println("All tests passed!");
    }
    
    public void testGetGreeting() {
        HelloWorld helloWorld = new HelloWorld();
        String greeting = helloWorld.getGreeting();
        if (!greeting.equals("Hello, World!")) {
            throw new AssertionError("Expected 'Hello, World!' but got: " + greeting);
        }
        System.out.println("testGetGreeting passed");
    }
}
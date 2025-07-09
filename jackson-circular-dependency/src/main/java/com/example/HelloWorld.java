package com.example;

public class HelloWorld {
    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();
        System.out.println(hw.getGreeting());
    }
    
    public String getGreeting() {
        return "Hello, World!";
    }
}
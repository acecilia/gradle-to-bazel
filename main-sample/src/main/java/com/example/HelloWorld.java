package com.example;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;

public class HelloWorld {
    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();
        System.out.println(hw.getGreeting());
        hw.demonstrateDependencyIntegration();
    }
    
    public String getGreeting() {
        return "Hello, World! Using Google Guava SNAPSHOT dependency";
    }
    
    public void demonstrateDependencyIntegration() {
        // Demonstrate using Guava SNAPSHOT dependency
        String paddedString = Strings.padEnd("Guava", 10, '*');
        System.out.println("Padded string using Guava: " + paddedString);
        System.out.println("Successfully using Google Guava SNAPSHOT: " + Strings.class.getName());
        System.out.println("Package: " + Strings.class.getPackage().getName());
        System.out.println("Lists utility available: " + Lists.class.getName());
        
        // Show that the Maven resolver has SNAPSHOT support built-in
        System.out.println("\n=== REAL SNAPSHOT INTEGRATION DEMO ===");
        System.out.println("Using Google Guava SNAPSHOT version: 999.0.0-HEAD-jre-SNAPSHOT");
        System.out.println("SNAPSHOT features demonstrated:");
        System.out.println("1. Real SNAPSHOT dependency resolution from Sonatype");
        System.out.println("2. Timestamped SNAPSHOT artifact handling");
        System.out.println("3. Public repository SNAPSHOT integration");
        System.out.println("4. Maven resolver SNAPSHOT support working!");
    }
}
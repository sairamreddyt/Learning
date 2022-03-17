package com.spring.JUnit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@DisplayName("First Testdemo")
@RunWith(JUnitPlatform.class)
public class FirstTest {
    @Test
    void one()
    {
        System.out.println("Test one executed");
    }
    
    @Test
    void two()
    {
        System.out.println("test 2");
    }
}

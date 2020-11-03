package com.example.demo.example4;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.assertj.core.internal.bytebuddy.implementation.bind.annotation.IgnoreForBinding;
import org.junit.jupiter.api.*;

public class LifeCycleTest {

    @BeforeAll
    public static void setUp() {
        System.out.println("Running before all");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("before each");
    }

    @AfterAll
    public static void tearDown(){
        System.out.println("Running after all");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("after each");
    }

    @Test
    public void testOne() {
        System.out.println("first test");
    }

    @Test
    public void testTwo() {
        System.out.println("second test");
    }

    @Disabled
    @Test
    public void toBeIgnored(){
        System.out.println("ignore me");
    }


}

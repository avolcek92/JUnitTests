package com.example.demo.example3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {
   private static CalculatorService calculatorService;


    @BeforeAll
    public static void setUp() {
        calculatorService = new CalculatorService();

    }

    @Test
    void add() {
        int actualResult = calculatorService.add(3,5);
        assertEquals(8,actualResult);
    }

    @Test
    void subtract() {
        int actualResult = calculatorService.subtract(5,3);
        assertEquals(2,actualResult);
    }

    @Test
    void multiply() {
        int actualResult = calculatorService.multiply(5,3);
        assertEquals(15,actualResult);
    }

    @Test
    void divide() {
        int actualResult = calculatorService.divide(10,2);
        assertEquals(5,actualResult);
    }

    @Test
    void testFindMax(){
        int [] arejus = {1,2,3,4,5};
        int actualMaxValue = calculatorService.findMax(arejus);
        assertEquals(5,actualMaxValue);
    }
    @Test
    void calculateExceptionI(){
        ArithmeticException arithmeticException = assertThrows(
                ArithmeticException.class, ()->calculatorService.divide(5,0),
                "Expected to throw an exception, but i didn't"

        );
        assertTrue(arithmeticException.getMessage().contains("by zero"));
    }
}
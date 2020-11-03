package com.example.demo.example5;

import com.example.demo.example3.CalculatorService;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class ParameterizedTests {

    @ParameterizedTest
    @ValueSource(ints = {1,3,5,-3,15,21})
    public void testIsOdd(int number){
        CalculatorService calculatorService = new CalculatorService();
        assertTrue(calculatorService.isOdd(number));
    }
}

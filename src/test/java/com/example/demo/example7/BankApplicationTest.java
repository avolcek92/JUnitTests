package com.example.demo.example7;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class BankApplicationTest {

    @Mock
    MarginCalculationService marginCalculationService;

    @InjectMocks
    BankApplication bankApplication = new BankApplication();


    @Test
    void doComplicateMarginCalculation() {
        when(marginCalculationService.calculateMargin(2.0,4.0)).thenReturn(2.0);
        double actualResult = bankApplication.doComplicateMarginCalculation(2.0,4.0);
                assertEquals(2.0, actualResult);

    }
    @Test
    void smartCalculateMonthly() {
        when(marginCalculationService.calculateMargin(2.0,4.0)).thenReturn(2.0);
        double actualResult = bankApplication.smartCalculateMonthly(2.0,4.0) ;
        assertEquals(7.2, actualResult);

    }
}
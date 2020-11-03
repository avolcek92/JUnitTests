package com.example.demo.example7;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BankApplication {
    private static final double FIXED_MARGIN = 1.3;
    private MarginCalculationService marginCalculationService;

    public double doComplicateMarginCalculation(double input, double otherInput){
        return marginCalculationService.calculateMargin(input,otherInput);
    }

    public double smartCalculateMonthly(double input, double otherInput){
        return marginCalculationService.calculateMargin(input, otherInput) + 4.0 * FIXED_MARGIN;
    }
}

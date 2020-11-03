package com.example.demo.example6;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import  static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

class PortfolioTest {

    private static Portfolio portfolio;
    private static StockService stockService;

    @BeforeAll
    public static void setUp(){
        portfolio = new Portfolio();
        //Create mock for object stockService(fake)
        stockService = mock(StockService.class);
        portfolio.setStockService(stockService);
    }

    @Test
    void getMarketValue() {
        List<Stock> stocks = new ArrayList<>();
        Stock googleStock = new Stock("1","google", 3);
        Stock microsoftStock = new Stock("2","microsoft",2);
        stocks.add(googleStock);
        stocks.add(microsoftStock);
        portfolio.setStocks(stocks);

        when(stockService.getPrice(googleStock)).thenReturn(10.00);
        when(stockService.getPrice(microsoftStock)).thenReturn(20.00);
        assertEquals(70,portfolio.getMarketValue());

        when(stockService.getPrice(googleStock)).thenReturn(0.00);
        when(stockService.getPrice(microsoftStock)).thenReturn(0.00);
        assertEquals(0,portfolio.getMarketValue());


    }
}
package com.example.demo.example6;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Stock {
    private String stockId;
    private String name;
    private int quantity;
}

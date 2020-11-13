package com.example.clientservice.model;

public class Stock {
    private int id;
    private String symbol;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Stock(int id, String symbol) {
        this.id = id;
        this.symbol = symbol;
    }
}

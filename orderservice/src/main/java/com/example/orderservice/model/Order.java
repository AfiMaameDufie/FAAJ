package com.example.orderservice.model;

public class Order {
    private int id;
    private int quantity;
    private String symbol;

    public Order(int id, int quantity, String symbol) {
        this.id = id;
        this.quantity = quantity;
        this.symbol = symbol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}

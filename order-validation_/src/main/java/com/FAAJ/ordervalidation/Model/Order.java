package com.FAAJ.ordervalidation.Model;



public class Order {
  
    private int id;
    private int clientId;
    private String symbol;
    private int quantity;


    public Order(int id, int clientId, String symbol, int quantity) {
        this.id = id;
        this.clientId = clientId;
        this.symbol = symbol;
        this.quantity = quantity;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}

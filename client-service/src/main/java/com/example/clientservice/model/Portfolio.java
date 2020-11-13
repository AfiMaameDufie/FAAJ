package com.example.clientservice.model;

import java.util.List;

public class Portfolio {
    private int id;
    private List<Stock> stocks;

    public Portfolio(int id, List<Stock> stocks) {
        this.id = id;
        this.stocks = stocks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(List<Stock> stocks) {
        this.stocks = stocks;
    }


}

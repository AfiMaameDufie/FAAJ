package com.example.clientservice.model;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private int id;
    private String email;
    private List<Portfolio> portfolios;


    public Client(int id, String email) {
        this.id = id;
        this.email = email;
        this.portfolios = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", email='" + email + '\'' +
                '}';
    }


    public void createPortfolio(List<Stock> stocks){
        this.portfolios.add(new Portfolio(1, stocks));
    }

    public List<Portfolio> getPortfolio(){
        return this.portfolios;
    }

}

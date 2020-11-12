package com.example.orderservice.service;

import com.example.orderservice.Data.OrderData;
import com.example.orderservice.Entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class OrderService {
    @Autowired
    private OrderData orderData;
    public Collection<Order> gettingAllOrders(){
        return orderData.getAllorders();
    }

    public Order gettingOrderById(int id){
        return this.orderData.getOrderById(id);
    }

    public void removingOrderById(int id){
        this.orderData.removeOrderById(id);
    }

    public void updatingOrder(Order order){
        this.orderData.updateOrder(order);
    }

    public void insertingOrder(Order order) {
        this.orderData.insertOrder(order);
    }
}

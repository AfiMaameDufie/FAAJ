package com.example.orderservice.Data;

import com.example.orderservice.Entity.Order;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class OrderData {
    private static Map<Integer, Order> orders;
    static{

    orders = new HashMap<Integer, Order>(){

        {
            put(1, new Order(1,"AAL",1000,45.9));
            put(2,new Order(2,"IBM",2000,89.7));
            put(3,new Order(3,"TSLA",4000,56.3));

        }
    };
}
  public Collection<Order> getAllorders(){
   return this.orders.values();
}
    public Order getOrderById(int id){
        return this.orders.get(id);
    }

    public void removeOrderById(int id){
        this.orders.remove(id);
    }
    public void updateOrder(Order order){
        Order s = orders.get(order.getId());
        s.setSymbol(order.getSymbol());
        s.setQuantity(order.getQuantity());
        s.setPrice(order.getPrice());

        orders.put(order.getId(), order);
    }


    public void insertOrder(Order order) {
        this.orders.put(order.getId(), order);
    }
}
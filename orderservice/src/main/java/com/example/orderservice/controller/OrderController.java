package com.example.orderservice.controller;

import com.example.orderservice.Entity.Order;
import com.example.orderservice.service.OrderService;
import com.example.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
@RestController
@RequestMapping(value = "/orders")
public class OrderController {

    @Autowired

    private OrderService orderService;
    @RequestMapping(method = RequestMethod.GET)
    public Collection<Order> getAllOrders(){
        return orderService.gettingAllOrders();
    }

     @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Order gettingOrderById(@PathVariable("id") int id){
        return orderService.gettingOrderById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void removeOrderById(@PathVariable("id") int id){
         orderService.removingOrderById(id);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void updateOrder( @RequestBody Order order){
        orderService.updatingOrder(order);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void insertOrder( @RequestBody Order order){
        orderService.insertingOrder(order);
    }
}

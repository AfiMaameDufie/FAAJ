package com.FAAJ.ordervalidation.Services;

import com.FAAJ.ordervalidation.Model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderValidationService {
    static List<Order> orders = new ArrayList<>();

    static {
        orders.add(new Order(1, 1, "IBM", 300));
        orders.add(new Order(2, 1, "APPL", 400));
        orders.add(new Order(3, 1, "NTL", 500));
        orders.add(new Order(4, 1, "GOOGLE", 600));
        orders.add(new Order(5, 1, "TSLA", 700));
    }

    public void validateOrder(Order order){

    }
}

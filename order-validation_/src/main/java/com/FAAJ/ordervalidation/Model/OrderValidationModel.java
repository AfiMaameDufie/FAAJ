package com.FAAJ.ordervalidation.Model;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.util.ArrayList;
import java.util.List;



public class OrderValidationModel implements Validator {
    private Order order;
//    private List<Order> orders = new ArrayList<>();

    public OrderValidationModel(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Order.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"symbol","symbol.empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"clientId","clientId.empty");
        Order order = (Order)target;
        if (order.getQuantity() < 1) {
            errors.rejectValue("quantity", "Invalid Quantity");
        }
    }




//    public List<Order> getOrders() {
//        return orders;
//    }
//
//    public void setOrder(List<Order> orders) {
//        this.orders = orders;
//    }



//    public OrderValidationModel(List<Order> orders) {
//        this.orders = orders;
//    }

    //future:check pricing based on trade engine insights



}

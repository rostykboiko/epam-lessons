package com.epam.coffeepoint;

import java.util.List;

class Order {
    private double orderNum;
    private CoffeeShopCustomer coffeeShopCustomer;
    private List<Coffee> coffeeList;
    private List<Food> foodList;
    private PaymentMethod paymentMethod;

    public Order(double orderNum,
                 CoffeeShopCustomer coffeeShopCustomer,
                 List<Coffee> coffeeList,
                 List<Food> foodList,
                 PaymentMethod paymentMethod) {
        this.orderNum = orderNum;
        this.coffeeShopCustomer = coffeeShopCustomer;
        this.coffeeList = coffeeList;
        this.foodList = foodList;
        this.paymentMethod = paymentMethod;
    }


    public double getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(double orderNum) {
        this.orderNum = orderNum;
    }

    public CoffeeShopCustomer getCoffeeShopCustomer() {
        return coffeeShopCustomer;
    }

    public void setCoffeeShopCustomer(CoffeeShopCustomer coffeeShopCustomer) {
        this.coffeeShopCustomer = coffeeShopCustomer;
    }

    public List<Coffee> getCoffeeList() {
        return coffeeList;
    }

    public void setCoffeeList(List<Coffee> coffeeList) {
        this.coffeeList = coffeeList;
    }

    public List<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}

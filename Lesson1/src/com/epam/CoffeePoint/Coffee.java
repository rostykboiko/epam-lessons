package com.epam.CoffeePoint;

public class Coffee {
    private String title;
    private PriceForFood priceForFood;

    public Coffee(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPriceForFood(int cups) {
        return priceForFood.getCharge(cups);
    }
}
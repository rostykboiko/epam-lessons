package com.epam.CoffeePoint;

class Food {
    private String title;
    private PriceForFood priceForFood;

    public Food(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPriceForFood(int quantity) {
        return priceForFood.getCharge(quantity);
    }
}

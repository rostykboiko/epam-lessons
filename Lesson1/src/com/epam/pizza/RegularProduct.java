package com.epam.pizza;

import com.epam.pizza.decorator.Extras;

class RegularProduct extends Extras {
    private String title;
    private double amount;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public double getAmountOfExtras() {
        return amount;
    }

    @Override
    public void setAmountOfExtras(double amount) {
        this.amount = amount;
    }
}

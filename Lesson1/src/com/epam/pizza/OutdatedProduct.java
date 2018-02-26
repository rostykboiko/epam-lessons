package com.epam.pizza;

import com.epam.pizza.decorator.Extras;

class OutdatedProduct extends Extras {
    private double amount;
    private double bonus;
    private String title;

    @Override
    public String getTitle() {
        return null;
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
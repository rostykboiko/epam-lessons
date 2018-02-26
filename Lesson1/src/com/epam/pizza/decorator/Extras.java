package com.epam.pizza.decorator;

public abstract class Extras extends PizzaDecorator {
    abstract public String getTitle();

    abstract public double getAmountOfExtras();

    abstract public void setAmountOfExtras(double amount);
}
package com.epam.pizza.decorator;

abstract public class PizzaDecorator {
    com.epam.pizza.Pizza pizza;

    abstract public double getAmountOfExtras();

    abstract public void setAmountOfExtras(double amount);

}

package com.epam.pizza;

abstract class Pizza {
    private String title;
    public String size;

    Pizza() {
    }

}

abstract class PizzaDecorator extends Pizza {
    Pizza pizza;

    abstract public double getAmountOfExtras();

    abstract public void setAmountOfExtras(double amount);

}

abstract class Extras extends PizzaDecorator {
    abstract public String getTitle();

    abstract public double getAmountOfExtras();

    abstract public void setAmountOfExtras(double amount);
}

abstract class ExtrasWithBonuses extends Extras {
    abstract public String getBonus();
}

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


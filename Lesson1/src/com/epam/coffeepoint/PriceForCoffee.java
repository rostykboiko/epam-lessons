package com.epam.coffeepoint;

abstract class PriceForCoffee {
    abstract String getTitle();
    abstract double getCharge(int cups);

    class Espresso {
        private double milk = 0.0;
        private double water = 0.0;
        private double coffee = 0.035;

        String getTitle() {
            return "Espresso";
        }

        double getCharge(int cups) {
            return (double) (cups * 15);
        }
    }

    class Americano {
        private double milk = 0.035;
        private double water = 0.0;
        private double coffee = 0.035;

        String getTitle() {
            return "Americano";
        }

        double getCharge(int cups) {

            return (double) (cups * 18);
        }
    }

    class Cappuccino {
        private double milk = 0.075;
        private double water = 0.0;
        private double coffee = 0.075;
        String getTitle() {
            return "Cappuccino";
        }

        double charge(int cups) {
            return (double) (cups * 22);
        }
    }

    class Doppio {
        private double milk = 0.0;
        private double water = 0.0;
        private double coffee = 0.0175;
        String getTitle() {
            return "Doppio";
        }

        double charge(int cups) {
            return cups * 20;
        }
    }

    class Latte {
        private double milk = 0.015;
        private double water = 0.0;
        private double coffee = 0.015;

        String getTitle() {
            return "Latte";
        }

        double charge(int cups) {
            return (double) cups * 25;
        }
    }

    class Custom {
        private final double DEFAULT = 0.0;
        private double milk = DEFAULT;
        private double water = DEFAULT;
        private double coffee = DEFAULT;

        Custom(double milk,
               double water,
               double coffee){
            this.coffee = coffee;
            this.milk = milk;
            this.water = water;
        }

        String getTitle() {
            return "Custom";
        }

        double charge(int cups) {
            return (double) cups * 30;
        }

        public double getMilk() {
            return milk;
        }

        public double getWater() {
            return water;
        }

        public double getCoffee() {
            return coffee;
        }
    }

}

package com.epam.CoffeePoint;

abstract class PriceForFood {
    abstract String getTitle();
    abstract double getCharge(int quantity);

    class HotDog{
        String getTitle(){
            return "HotDog";
        }

        double getCharge(int quantity){
            return (double) (quantity * 35);
        }
    }

    class Sandwitch{
        String getTitle(){
            return "Sandwitch";
        }

        double getCharge(int quantity){
            return (double) (quantity * 30);
        }
    }
}

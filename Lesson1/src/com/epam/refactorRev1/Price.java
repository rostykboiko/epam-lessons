package com.epam.refactorRev1;

abstract class Price {
    abstract int getPriceCode();

    class ChildrenPrice {
        double getCharge(int daysRented) {
            double result = 2;
            if (daysRented > 2)
                result += (daysRented - 2) * 1.5;
            return result;
        }
    }

    class NewReleasePrice {
        double charge(int daysRented){
            double result = 1.5;
            if (daysRented > 3)
                result += (daysRented - 3) * 1.5;
            return result;
        }

        int getFrequentRenterPoints(int daysRented){
            return (daysRented > 1) ? 2: 1;
        }
    }

    class RegularPrice {
        double charge(int daysRented){
            return daysRented * 3;
        }
    }

    abstract double getCharge(int daysRented);

    int getFrequentRenterPoints(int daysRented){
            return 1;
    }
}
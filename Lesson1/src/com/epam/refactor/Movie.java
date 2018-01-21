package com.epam.refactor;

public class Movie {
    private String _title;
    private Price _price;

    public Movie(String title, int priceCode) {
        _title = title;
    }

    public String getTitle() {
        return _title;
    }

    double getCharge(int daysRented) {
        return _price.getCharge(daysRented);
    }

    Price getPrice(){
        return _price;
    }
}

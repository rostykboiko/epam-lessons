package com.epam.refactor;


public class Movie {
    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String _title;
    private Price _price;

    public Movie(String title, int priceCode) {
        _title = title;
        setPriceCode(priceCode);
    }

    public int getPriceCode() {
        return _price.getPriceCode();
    }

    public String getTitle() {
        return _title;
    }

    double getCharge(int daysRented) {
        return _price.getCharge(daysRented);
    }

    void setPriceCode(int arg) {
        switch (arg) {
            case Movie.REGULAR:
                _price = new Price.RegularPrice();
                break;
            case Movie.CHILDREN:
                _price = new Price.ChildrensPrice();
                break;
            case Movie.NEW_RELEASE:
                _price = new Price.NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

    int getFrequentRenterPoints(int daysRented) {
        if ((getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1) return 2;
        else return 1;
    }

    abstract class Price {
        abstract int getPriceCode();

        class ChildrensPrice {
            int getPriceCode() {
                return Movie.CHILDREN;
            }
        }

        class NewReleasePrice {
            int getPriceCode() {
                return Movie.NEW_RELEASE;
            }
        }

        class RegularPrice {
            int getPriceCode() {
                return Movie.REGULAR;
            }
        }

        double getCharge(int daysRented) {
            double result = 0;
            switch (getPriceCode()) {
                case Movie.REGULAR:
                    result += 2;
                if (daysRented > 2) result += (daysRented - 2) * 1.5;
                break;
                case Movie.NEW_RELEASE:
                    result += daysRented * 3;
                    break;
                case Movie.CHILDREN:
                    result += 1.5;
                    if (daysRented > 3) result += (daysRented - 3) * 1.5;
                    break;
            } return result
        }
    }
}

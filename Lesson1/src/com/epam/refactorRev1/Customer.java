package com.epam.refactorRev1;

import java.util.Enumeration;
import java.util.Vector;

class Customer {
    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        double totalAmount = 0;
        Enumeration rentals = _rentals.elements();
        StringBuilder result = new StringBuilder("Rental Record for " + getName() + "\n");
        while (rentals.hasMoreElements()) {
            Rental aRental = (Rental) rentals.nextElement();
            // determine amounts for each line
            // add frequent renter points

            // show figures for this rental

            result.append("\t").append(aRental.getMovie().getTitle()).append("\t").append(String.valueOf(aRental.getCharge())).append("\n");
        }
        // add footer lines
        result.append("Amount owed is ").append(String.valueOf(getTotalCharge())).append("\n");
        result.append("You earned ").append(String.valueOf(getTotalFrequentRenterPoints())).append(" frequent renter points");
        return result.toString();
    }

    public String htmlStatement() {
        Enumeration rentals = _rentals.elements();
        StringBuilder result = new StringBuilder("<H1>Rentals for <EM>" + _name + "</EM></H1><P>\n");

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();

            //show figures for each rental
            result.append(each.getMovie().getTitle()).append(": ").append(String.valueOf(each.getCharge())).append("<BR>\n");

        }
        //add footer lines
        result.append("<P>You owe <EM>").append(String.valueOf(getTotalCharge())).append("</EM><P>\n");
        result.append("On this rental you earned <EM>").append(String.valueOf(getTotalFrequentRenterPoints())).append("</EM> frequent renter points<P>");
        return result.toString();

    }

    private double getTotalCharge() {
        double result = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            // determine amounts for each line
            // add frequent renter points
            result = each.getCharge();
        }
        return result;
    }

    private double getTotalFrequentRenterPoints() {
        double result = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }
}
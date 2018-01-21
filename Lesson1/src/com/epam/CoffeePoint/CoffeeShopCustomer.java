package com.epam.CoffeePoint;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShopCustomer {
    private String customersName;
    private PaymentMethod.BonusCard bonusCard;
    private List<Order> orderHistory = new ArrayList<>();

    public CoffeeShopCustomer(String customersName) {
        this.customersName = customersName;
    }

    public CoffeeShopCustomer(String customersName, PaymentMethod.BonusCard bonusCard) {
        this.customersName = customersName;
        this.bonusCard = bonusCard;
    }

    public String getCustomersName() {
        return customersName;
    }

    public void setCustomersName(String customersName) {
        this.customersName = customersName;
    }

    public PaymentMethod.BonusCard getBonusCard() {
        return bonusCard;
    }

    public void setBonusCard(PaymentMethod.BonusCard bonusCard) {
        this.bonusCard = bonusCard;
    }
}

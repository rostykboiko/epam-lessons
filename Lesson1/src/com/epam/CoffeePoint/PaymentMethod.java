package com.epam.CoffeePoint;

abstract class PaymentMethod {
    class CreditCard {
        int creditCardNumber;

        void setCreditCardNumber(int creditCardNumber) {
            this.creditCardNumber = creditCardNumber;
        }

        void giveBonus(int bonusCardNumber, int amount){
            BonusCard bonusCard = new BonusCard(bonusCardNumber, amount);
        }
    }

    class Cash{
        void giveBonus(int bonusCardNumber, int amount){
            BonusCard bonusCard= new BonusCard(bonusCardNumber, amount);
        }
    }

    class BonusCard {
        int bonusNumber;
        int bonusValue;

        public BonusCard(){}

        public BonusCard(int bonusNumber, int bonusValue) {
            this.bonusNumber = bonusNumber;
            this.bonusValue = bonusValue;
        }

        void setCreditCardNumber(int bonusNumber) {
            this.bonusNumber = bonusNumber;
        }

        public void setBonusNumber(int bonusNumber) {
            this.bonusNumber = bonusNumber;
        }

        public void setBonusValue(int bonusValue) {
            this.bonusValue = bonusValue;
        }
    }
}

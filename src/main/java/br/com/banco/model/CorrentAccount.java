package main.java.br.com.banco.model;

import main.java.br.com.banco.controller.paymentMethods;

public final class CorrentAccount implements Account, paymentMethods{
    private double creditCardLimit = 1000.00;
    private double debitLimit = 150.00;
    public double balanceCorrentAccount;

    @Override
    public void deposit(double value) {

        if (this.debitLimit < 150.00) {
            this.debitLimit = this.debitLimit + value;
            this.balanceCorrentAccount = this.balanceCorrentAccount + (value - (150.00 - this.debitLimit));
            System.out.println("Deposited successfully");
        }

        else {
            this.balanceCorrentAccount = this.balanceCorrentAccount + value;
            System.out.println("Deposited successfully");
        }

    }

    @Override
    public void withdraw(double value) {
        if (value > this.balanceCorrentAccount && value <= this.debitLimit) {
            this.debitLimit = this.debitLimit - (value - this.balanceCorrentAccount);
            this.balanceCorrentAccount = 0;
            System.out.println("Withdrawn successfully with debit limit");
        }

        else if (value <= this.balanceCorrentAccount) {
            this.balanceCorrentAccount = this.balanceCorrentAccount - value;
            System.out.println("Withdrawn successfully");
        }

        else {
            System.out.println("Insufficient balance");
        }
    }


    @Override
    public void creditCardPayment(double value) {
        if (value <= this.creditCardLimit) {
            System.out.println("Payment successful");
            this.creditCardLimit = this.creditCardLimit - value;
        }

        else {
            System.out.println("Insufficient credit card limit");
        }
    }

    @Override
    public void debitCardPayment(double value) {
        if (value >= this.balanceCorrentAccount) {
            this.balanceCorrentAccount = this.balanceCorrentAccount - value;
            System.out.println("Withdrawn successfully");
        }

        else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public void pixPayment(double value) {
        if (value >= this.balanceCorrentAccount) {
            this.balanceCorrentAccount = this.balanceCorrentAccount - value;
            System.out.println("Withdrawn successfully");
        }

        else {
            System.out.println("Insufficient balance");
        }

    }

    @Override
    public void showBalance() {
        System.out.println("Your balance is: " + this.balanceCorrentAccount);
    }

    public void payment(double value, int paymentMethod) {
        if (value <= this.balanceCorrentAccount) {
            switch (paymentMethod){
                case 1:
                    debitCardPayment(value);
                    break;
                case 2:
                    pixPayment(value);
                    break;
                case 3:
                    creditCardPayment(value);
                    break;
                default:
                    System.out.println("Invalid payment method");



            }

        }

    }

}

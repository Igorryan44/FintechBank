package main.java.br.com.banco.controller;

public class Transactions {
    public String transactionType;
    public double transactionTax;
    public double transactionValue;

    public String getType() {
        return transactionType;
    }

    public void setType(String transactionType) {
        this.transactionType = transactionType;
    }

    public double getTax() {
        return transactionTax;
    }

    public void setTax(double transactionTax) {
        this.transactionTax = transactionTax;
    }

    public final void deposit(){
        System.out.println("Carrying deposit");
    }

    public final void withdraw(){
        System.out.println("Carrying withdrawal");
    }

    public Transactions(String transactionType, double transactionTax) {
        this.transactionType = transactionType;
        this.transactionTax = transactionTax;
    }
}

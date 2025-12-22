package main.java.br.com.banco.controller;

public class Pix extends Transactions{

    public Pix(String transactionType, double transactionTax) {
        super(transactionType, transactionTax);
        this.transactionType = "Pix";
        this.transactionTax = 0;
    }
}

package main.java.br.com.banco.controller;

public class Credit extends Transactions{

    public Credit(String transactionType, double transactionTax) {
        super(transactionType, transactionTax);
        this.transactionType = "Credit";
        this.transactionTax = 0.45;
    }
}

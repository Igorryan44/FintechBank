package main.java.br.com.banco.controller;

public class Debit extends Transactions{

    public Debit(String transactionType, double transactionTax) {
        super(transactionType, transactionTax);
        this.transactionType = "Debit";
        this.transactionTax = 0.01;
    }
}

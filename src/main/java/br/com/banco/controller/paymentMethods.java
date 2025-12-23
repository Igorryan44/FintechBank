package main.java.br.com.banco.controller;

public interface paymentMethods {
    public void creditCardPayment(double value);
    public void debitCardPayment(double value);
    public void pixPayment(double value);

}

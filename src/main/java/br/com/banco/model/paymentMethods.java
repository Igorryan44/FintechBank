package main.java.br.com.banco.model;

public interface paymentMethods {
    public void creditCardPayment(double value);
    public void debitCardPayment(double value);
    public void pixPayment(double value);

}

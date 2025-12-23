package main.java.br.com.banco.model;

public final class CorrentAccount implements Account{

    public double balance;

    @Override
    public void deposit(double value) {

    }

    @Override
    public void withdraw(double value) {
        if (value >= this.balance) {
            this.balance = this.balance - value;
            System.out.println("Withdrawn successfully");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void payment(double value) {

    }


}

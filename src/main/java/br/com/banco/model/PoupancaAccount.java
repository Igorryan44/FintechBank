package main.java.br.com.banco.model;

public final class PoupancaAccount implements Account{
    public double balancePoupancaAccount;
    public double interestRate = 0.05;


    @Override
    public void deposit(double value) {
        this.balancePoupancaAccount = this.balancePoupancaAccount + value;
        System.out.println("Deposited successfully");
    }

    @Override
    public void withdraw(double value) {
        if (value >= this.balancePoupancaAccount) {
            this.balancePoupancaAccount = this.balancePoupancaAccount - value;
            System.out.println("Withdrawn successfully");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public void showBalance() {
        System.out.println("Your balance is: " + this.balancePoupancaAccount);
    }

    private void moviInterestRate(){
        this.balancePoupancaAccount = this.balancePoupancaAccount + (this.balancePoupancaAccount * this.interestRate);
    }

}

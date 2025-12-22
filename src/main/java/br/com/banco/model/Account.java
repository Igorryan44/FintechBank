package main.java.br.com.banco.model;

public abstract class Account {
    String accountStatus;
    int sold;
    String id;

    public String getAccountStatus() {

        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

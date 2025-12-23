package main.java.br.com.banco.auth;

public class Client extends User{


    @Override
    public boolean isTotalAccess() {
        return false;
    }

    @Override
    public void setTotalAccess(boolean totalAccess) {

    }
}

package main.java.br.com.banco.auth;

import java.util.Random;
import java.util.UUID;

public abstract class User {
    public String userId = UUID.randomUUID().toString();
    public String userFullName;
    public String userNickName;
    public static String userCPF;
    public String userStatus;
    public boolean totalAccess;




    public void userInformations(){
        System.out.println("User ID: " + this.userId);
        System.out.println("User nikname: " + this.userNickName);
        System.out.println("User status: " + this.userStatus);
        System.out.println("Acces full: " + this.totalAccess);

    }

    public abstract boolean isTotalAccess();

    public abstract void setTotalAccess(boolean totalAccess);
}

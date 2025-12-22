package main.java.br.com.banco.auth;

public abstract class User {
    public String userId;
    public String userFullName;
    public String userNickName;
    public String userCPF;
    public String userStatus;
    public boolean totalAccess;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public String getUserCPF() {
        return userCPF;
    }

    public void setUserCPF(String userCPF) {
        this.userCPF = userCPF;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public boolean isTotalAccess() {
        return totalAccess;
    }

    public void setTotalAccess(boolean totalAccess) {
        this.totalAccess = totalAccess;
    }

    public void userInformations(){
        System.out.println("User ID: " + this.userId);
        System.out.println("User nikname: " + this.userNickName);
        System.out.println("User status: " + this.userStatus);
        System.out.println("Acces full: " + this.totalAccess);

    }
}

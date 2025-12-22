package main.java.br.com.banco.auth;

public class Employee extends User{
    public String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean isTotalAccess() {
        return totalAccess;
    }

    @Override
    public void setTotalAccess(boolean totalAccess) {
        if (this.category.equals("Manager")){
            this.totalAccess = true;
        } else
            this.totalAccess = totalAccess;

    }
}

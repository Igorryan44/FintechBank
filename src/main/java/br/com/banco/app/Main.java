package main.java.br.com.banco.app;

import main.java.br.com.banco.auth.Employee;
import main.java.br.com.banco.auth.User;

public class Main {
    public static void main(String[] args) {
        Employee user = new Employee();
        user.setCategory("Fulano");
        user.userInformations();

    }
}
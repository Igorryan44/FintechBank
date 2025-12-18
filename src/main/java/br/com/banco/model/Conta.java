package main.java.br.com.banco.model;

import java.util.Scanner;

public class Conta {
    String statusConta;
    String nomeUsuario;
    String cpfUsuario;
    String idConta;
    int saldoConta;

    public Conta(String statusConta ,String nomeUsuario, String cpfUsuario, String idConta, int saldoConta)  {
        this.statusConta = statusConta;
        this.nomeUsuario = nomeUsuario;
        this.cpfUsuario = cpfUsuario;
        this.idConta = idConta;
        this.saldoConta = saldoConta;
    }
    public void Informacao() {
        System.out.println("Informações da conta bancária: \n");
        System.out.println("Status da conta: " + this.statusConta);
        System.out.println("Nome do usuário: " + this.nomeUsuario);
        System.out.println("CPF do usuário: " + this.cpfUsuario);
        System.out.println("ID da conta: " + this.idConta);
        System.out.println("Saldo atual: " + this.saldoConta);
    }

    public void Saque() {
        System.out.println("Insira o valor do saque:\n");
        Scanner entradaSaque = new Scanner(System.in);
        int valorSaque = entradaSaque.nextInt();
        entradaSaque.nextLine();

        System.out.println("O valor do saque é de: " + valorSaque + ". Prosseguir com a operação?\n");
        System.out.println("Digite 1 para sim ou 2 para não\n");
        int confirmEntrada = entradaSaque.nextInt();
        entradaSaque.nextLine();

        if (confirmEntrada == 1 && this.saldoConta >= valorSaque) {
            System.out.println("Operação aprovada!\nSepósito de " + valorSaque + " efetuado");
            this.saldoConta = this.saldoConta - valorSaque;

        } else if(confirmEntrada == 2) {
            System.out.println("Operação não aprovada!\nCancelando operação");

        } else {
            System.out.println("Operação não aprovada\nSaldo atual: " + this.saldoConta + "\nSaque desejado: " + valorSaque);
        }
        System.out.println("Operação encerrada, tenha um bom dia!");
    }
    public void Deposito() {
        System.out.println("Iniciando operação de depósito");
        Scanner entradaDeposito = new Scanner(System.in);

        System.out.println("Digite o valor do deposito: \n");
        int valorDeposito = entradaDeposito.nextInt();
        this.saldoConta = this.saldoConta + valorDeposito;
        System.out.println("Transação aprovada!");
        System.out.println("Saldo atual da conta: " + this.saldoConta);
        System.out.println("Operação encerrada, tenha um bom dia!");

    }
}

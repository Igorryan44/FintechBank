import java.util.Scanner;

public class Conta {
    String nomeUsuario;
    String cpfUsuario;
    String idConta;
    long saldoConta;

    Conta(String nomeUsuario, String cpfUsuario, String idConta, int saldoConta)  {
        this.nomeUsuario = nomeUsuario;
        this.cpfUsuario = cpfUsuario;
        this.idConta = idConta;
        this.saldoConta = saldoConta;
    }
    public void Informacao() {
        System.out.println("Informações da conta bancária: \n");
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

        if (confirmEntrada == 1) {
            System.out.println("Operação aprovada!\nDepósito de " + valorSaque + " efetuado");
            this.saldoConta = this.saldoConta - valorSaque;

        } else if(confirmEntrada == 2) {
            System.out.println("Operação não aprovada!\nCancelando operação");

        }
        System.out.println("Operação encerrada, tenha um bom dia!");
    }
}

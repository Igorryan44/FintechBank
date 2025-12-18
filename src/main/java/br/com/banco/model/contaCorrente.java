package main.java.br.com.banco.model;

public class contaCorrente extends Conta{

    String taxaServico;

    public contaCorrente(String statusConta, String nomeUsuario, String cpfUsuario, String idConta, int saldoConta, String taxaServico){
        super(statusConta, nomeUsuario, cpfUsuario, idConta, saldoConta);
        this.statusConta = statusConta;
        this.taxaServico = taxaServico;
    }
    public void Informacao(){
        super.Informacao();
        System.out.println("Status da conta corrente: " + this.statusConta);
    }
}

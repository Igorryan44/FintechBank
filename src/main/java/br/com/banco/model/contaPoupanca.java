package main.java.br.com.banco.model;

public class contaPoupanca extends Conta{
    int rendimento;

    public contaPoupanca(int rendimento, String statusConta, String nomeUsuario, String cpfUsuario, String idConta, int saldoConta){
        super(statusConta, nomeUsuario, cpfUsuario, idConta, saldoConta);
        this.rendimento = rendimento;
    }
    public void Informacao() {
        super.Informacao();
        System.out.println("Informes de rendimento: " + this.rendimento);
    }
}

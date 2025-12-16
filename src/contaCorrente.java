public class contaCorrente extends Conta{

    String statusConta;

    contaCorrente(String statusConta, String nomeUsuario, String cpfUsuario, String idConta, int saldoConta){
        super(nomeUsuario, cpfUsuario, idConta, saldoConta);
        this.statusConta = "Ativo";
    }
    public void Informacao(){
        super.Informacao();
        System.out.println("Status da conta corrente: " + this.statusConta);
    }
}

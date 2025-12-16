public class Main {
    public static void main(String[] args) {

//      Utilizando herança
        contaCorrente contaCorrente1 = new contaCorrente(
                "Ativo",
                "Igor Ryan",
                "08108694116",
                "01ab",
                10);
        contaCorrente1.Informacao();
        contaCorrente1.Saque();

//      Utilizando Polimorfismo
        Conta contaCorrente2 = new contaCorrente(
                "Ativo",
                "Igor Ryan",
                "08108694116",
                "01ab",
                10);
        contaCorrente2.Informacao();
        contaCorrente2.Saque();
    }
}

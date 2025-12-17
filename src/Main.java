public class Main {
    public static void main(String[] args) {

        Conta contaPoupanca1 = new contaPoupanca(
                2,
                "Ativo",
                "Fulano",
                "0142583698",
                "145",
                0);
        contaPoupanca1.Informacao();
        contaPoupanca1.Deposito();
        contaPoupanca1.Saque();
    }
}

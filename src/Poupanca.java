public class Poupanca extends Conta{
    public Poupanca(String numero, float saldoInicial) {
        super(numero, saldoInicial);
    }

    @Override
    public void Sacar(float valor) throws SaldoInsuficienteException {
        if ( valor > saldo ) {
            System.out.println("Conta popança não pode ficar negativa!");
        }
        saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado com sucesso na conta poupança.");
    }

}

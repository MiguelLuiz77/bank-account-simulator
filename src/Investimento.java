public class Investimento extends Conta implements Tributavel{
    public Investimento(String numero, float saldoInicial) {
        super(numero, saldoInicial);
    }

    @Override
    public void Sacar(float valor) throws SaldoInsuficienteException {
        if ( saldo < 100) {
           throw new SaldoInsuficienteException("Saque indisponível. Saldo minímo de R$100,00 exigido.");
        }
        if (valor > saldo ) {
            throw new SaldoInsuficienteException("Saldo insuficiente para este saque.");
        }
        saldo -= valor;
        System.out.println("Saque realizado com sucesso na conta de investimento!");
    }

    @Override
    public float getValorImposto() {
        return saldo * (15/100.0f);
    }

}

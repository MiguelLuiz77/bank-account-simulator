public class Corrente extends Conta implements Tributavel{
    private float limite = 500.00f;

    public Corrente(String numero, float saldoInicial) {
        super(numero, saldoInicial);
    }

    @Override
    public void Sacar(float valor) throws SaldoInsuficienteException {
        if (valor > ( saldo + limite)) {
            System.out.println("Saldo e limite insuficientes para este saque.");
        }
        saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado na corrente.");
    }

    @Override
    public float getValorImposto() {
        return 19.90f; //taxa fixa da manutenção mensal
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
}

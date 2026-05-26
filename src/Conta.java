public abstract class Conta {
    protected String numero;
    protected float saldo;

    public Conta(String numero, float saldoInicial) {
        this.numero = numero;
        this.saldo = saldoInicial;
    }
    public void depositar(float valor) {
        if ( saldo > 0 ) {
            this.saldo += valor;
            System.out.println("O depósito no valor de R$" + valor + " foi realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito indísponivel.");
        }
    }

    public abstract void Sacar(float valor) throws SaldoInsuficienteException;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}

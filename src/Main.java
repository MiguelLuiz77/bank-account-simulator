public class Main {
    static void main(String[] args) {
        Corrente cc = new Corrente("1010-X", 200.0f);
        Poupanca cp = new Poupanca("2020-O", 500.00f);
        Investimento investimento = new Investimento("3030-I", 80.0f);

        System.out.println("=== TESTANDO CONTA POUPANÇA ===");
        try {
            cp.Sacar(100.0f);
            System.out.println("Saque realizado! Saldo atual de R$" + cp.getSaldo()  );
        } catch (SaldoInsuficienteException e) {
            System.err.println("Erro: " + e.getMessage());
        }

        System.out.println("\n=== TESTANDO CONTA CORRENTE ( COM LIMITE ) ===");
        try {
            cc.Sacar(600.0f);
            System.out.println("Saldo Corrente ( negativo ): R$" + cc.getSaldo());
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro na corrente: " + e.getMessage());
        }

        System.out.println("\n=== TESTANDO CONTA INVESTIMENTO ===");
        try {
            investimento.Sacar(20.0f);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro no investimento: " + e.getMessage());
        }

        System.out.println("\n=== VERIFICANDO TRIBUTAÇÃO ===");
            if ( cc instanceof Tributavel ) {
                System.out.println("Essa conta paga imposto!");
            }
            if (investimento instanceof Tributavel) {
                System.out.println("Imposto do investimento (15% de R$80,00): R$" + investimento.getValorImposto());
        }
    }

}

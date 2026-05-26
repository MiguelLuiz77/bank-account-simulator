# Simulador de Conta Bancária (Versão Evoluída) 🚀

Este é um simulador de sistema bancário desenvolvido em Java para consolidar conceitos avançados de Orientação a Objetos, com foco prático no uso de **Interfaces** e **Tratamento de Exceções Customizadas**.

## 🛠️ Funcionalidades e Regras de Negócio
- **Conta Corrente:** Possui um limite de cheque especial e é um tipo Tributável (sofre taxas de manutenção).
- **Conta Poupança:** Possui uma regra estrita onde o saldo nunca pode ficar negativo.
- **Conta Investimento:** Exige um saldo mínimo de R$ 100,00 para permitir saques e taxa de imposto correspondente a 15% do saldo.

## 🧠 Conceitos de Java Aplicados
- **Abstração e Herança:** Utilização da classe mãe abstrata `Conta` para herança das contas filhas.
- **Polimorfismo:** Sobrescrita de métodos com `@Override` para adaptar as regras de saque de cada conta.
- **Interfaces:** Criação e implementação da interface `Tributavel` para gerenciamento de impostos.
- **Tratamento de Erros:** Criação da exceção personalizada `SaldoInsuficienteException` e controle de fluxo com blocos `try-catch`.

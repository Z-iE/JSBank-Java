package Banco;

import java.util.Scanner;

public class contaPoupanca extends Contas {

    // -- Atributos -> valor da Selic para cálculos; e o deposito remunerado que só é possível na conta poupança;
    // -- Criar uma forma de poder retirar o dinheiro da conta para transformar em deposito remunerado;
    // -- Override do método getsaldo;
    private double selic = 13.75;
    private double depositoRemunerado;
    Scanner entrada = new Scanner(System.in);

    // -- Construtor da conta poupança repassando os valores para a superclasse;
    public contaPoupanca(int numeroConta, int numeroAgencia, String nome, String CPF, int senhaInserida) {
        super(numeroConta, numeroAgencia, nome, CPF, senhaInserida);
    }

    // -- Métodos
    // -- Método de deposito remunerado, tem um teste para imprimir o nome mês kk
    // (criar get e se for true retorna valor do saldo e dos investimentos);
    public void depositoRemunerado() {
        String tempo;
        // -- Entrada das opções pelo cliente
        System.out.println("Digite quantos meses serão: ");
        double meses = entrada.nextDouble();
        System.out.println("Digite o valor do depósito");
        double deposito = entrada.nextDouble();
        this.depositoRemunerado = deposito;
        double calculadora = calculaRemuneracao(meses) - deposito;
        System.out.println("Deseja usar seu saldo para deposito? Se SIM digite 1, NÃO digite 2.");
        int opcao = entrada.nextInt();

        if (meses > 1) {
            tempo = "meses";
        } else {
            tempo = "mês";
        }

        if (opcao == 1) {
            if(this.sacar(deposito)){
                System.out.println("\nSeu deposito foi aplicado você tera o retorno de: R$" + (calculadora) + " em " +
                        (int) meses + " " + tempo + ".");
            } else {
                System.out.println("Deposito não concluído.");
            }
        } else {
            System.out.println("\nSeu deposito foi aplicado você tera o retorno de: R$" + (calculadora) + " em " +
                    (int) meses + " " + tempo + ".");
        }
    }
    // -- Getter do deposito remunerado;
    public double getDepositoRemunerado() {
        return depositoRemunerado;
    }

    // -- Método para calcular a remuneração da sua conta dependendo do valor da Selic;
    public double calculaRemuneracao(double meses) {
        if (selic < 8.5) {
            return depositoRemunerado = depositoRemunerado * ((0.7 * selic) + 1) * meses;
        } else {
            return depositoRemunerado = depositoRemunerado * 1.05 * meses;
        }
    }

    @Override
    public void conta() {
        super.conta();
        if (depositoRemunerado > 0){
            System.out.println("Valor em investimentos: " + this.getDepositoRemunerado());
        }
    }
}


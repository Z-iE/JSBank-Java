package Banco;

import java.util.Scanner;

public abstract class Contas {
    // -- Atributos
    // -- A conta TEM UM número, agência, saldo e a conta TEM UM cliente;
    private int numeroConta;
    private int numeroAgencia;
    private double saldo;
    protected Cliente cliente;


    // -- Construtor das contas
    public Contas(int numeroConta, int numeroAgencia, String nome, String CPF, int senhaInserida) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.cliente = new Cliente(nome, CPF, numeroConta, senhaInserida);
    }

    //Getters e Setters
    public int getNumeroConta() {
        return numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public Cliente getCliente() {
        return cliente;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }
    // -- Métodos

    // -- Método para sacar dinheiro da conta, é feito uma autenticação usando o número da conta do cliente e sua senha;
    public boolean sacar(double valor){
        // -- Entrada dos dados do cliente na hora do saque;
        System.out.println("\nDigite seu login");
        Scanner login = new Scanner(System.in);
        int contaUsuario = login.nextInt();
        System.out.println("\nDigite sua senha");
        int senhaUsuario = login.nextInt();
        // -- Teste lógico para autenticação;
        if(cliente.clienteAutenticacao.Autentica(contaUsuario, senhaUsuario)){
            // -- Teste lógico para saber se o cliente possui saldo suficiente;
            if(this.saldo < valor){
                System.out.println("\nValor Insuficiente, transação cancelada.");
                return false;
            }else {
                saldo-= valor;
                System.out.println("\nTransacão concluída, seu novo saldo " + cliente.getNome() + " é de R$" + saldo + ".");
                return true;
            }
        }
        else {
            System.out.println("\nAutenticação Incorreta.");
            return false;}
    }

    // -- Método para depositar dinheiro, é feito uma verificação do CPF do cliente;
    public void depositar(double valor, String CPF){
        if (this.cliente.getCPF().equals(CPF)){
        saldo += valor;
        System.out.println("\nDeposito concluido, seu novo saldo é R$" + saldo + ".");
        }
        else {
            System.out.println("\nCPF Inválido.");
        }
    }

    // -- Método para transferência, é feito uma autenticação do cliente e o CPF do destinatário;
    public void transferir(double valor, Contas remetente, Contas destinatario, String CPF){
        if (remetente.saldo >= valor){
            if (destinatario.cliente.getCPF().equals(CPF)){
            remetente.sacar(valor);
            destinatario.saldo+=valor;
            }
            else {
                System.out.println("\nCPF Inválido.")
                ;
            }
        }
        else {
            System.out.println("\nA conta não possui recursos suficientes para concluir a transação.");
        }
    }

    public void conta(){
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Nome do Propriétario: " + cliente.getNome());
        System.out.println("Número do CPF: " + cliente.getCPF());
        System.out.println("Numero da Conta: " + this.getNumeroConta() + " Número da Agência: " + this.getNumeroAgencia());
        System.out.println("Saldo: " + this.getSaldo());
    }
}

package Banco;

public abstract class Contas {
    private int numeroConta;
    private int numeroAgencia;
    protected Cliente cliente;


    private double saldo;

    public Contas(int numeroConta, int numeroAgencia, String nome, String CPF, int senhaInserida, String loginInserido) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.cliente = new Cliente(nome, CPF,loginInserido, senhaInserida);
    }

    //Getters e Setters

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public void saldo() {
        System.out.println("Seu saldo é de " + saldo);
    }

// Métodos

    public void sacar(double valor){
        if(cliente.clienteAutenticacao.Autentica()){
            if(this.saldo < valor){
            System.out.println("Valor Insuficiente");
            }else {
            saldo -= valor;
            System.out.println("Transacão concluida, seu novo saldo é " + saldo + ".");
            }
        }
        else {
            System.out.println("Autenticação Incorreta");}
    }
    public void depositar(double valor){
        saldo += valor;
        System.out.println("Transacão concluida, seu novo saldo é R$" + saldo + ".");
    }

    public void transferir(double valor, Contas remetente, Contas destinatario){
        if (remetente.saldo >= valor){
            destinatario.saldo+= valor;
            remetente.saldo-=valor;
            System.out.println("Transferência conclúida seu novo saldo é de: R$" + remetente.saldo + ".");

        }
        else {
            System.out.println("A conta não possui recursos suficientes para concluir a transação.");
        }


    }
}

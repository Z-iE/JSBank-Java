package Banco;

public class contaCorrente extends Contas{
    public contaCorrente(int numeroConta, int numeroAgencia, String nome, String CPF, int senhaInserida, String loginInserido) {
        super(numeroConta, numeroAgencia, nome, CPF, senhaInserida, loginInserido);
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor + 0.7);
    }
}

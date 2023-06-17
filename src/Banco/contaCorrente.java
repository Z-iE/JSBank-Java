package Banco;

public class contaCorrente extends Contas{

    // -- Construtor da conta corrente enviando os atributos para a superclasse;
    public contaCorrente(int numeroConta, int numeroAgencia, String nome, String CPF, int senhaInserida) {
        super(numeroConta, numeroAgencia, nome, CPF, senhaInserida);
    }

    // -- Override do método saque adiciando uma taxa na conta corrente;
    @Override
    public boolean sacar(double valor) {
        super.sacar(valor + 0.7);
        return true;
    }
}

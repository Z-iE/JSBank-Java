package Banco;

public class Bancario extends Funcionario{
    public Autenticacao bancarioAutenticacao;
    double salario = 1200.00;

    public Bancario(String nome, int senhaInserida, String loginInserido) {
        super(nome, senhaInserida, loginInserido);
    }

    public double getSalario() {
        return salario;
    }

    // Métodos
    @Override
    public void bonificacao() {
        System.out.println( this.getSalario() + (this.getSalario() * 0.2));
    }
}

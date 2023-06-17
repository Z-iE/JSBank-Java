package Banco;

public class Gerente extends Funcionario{

    public Autenticacao gerenteAutenticacao;
    private double salario = 2700.00;

// Construtor
    public Gerente(String name, int senhaInserida,  String loginInserido) {
        super(name, senhaInserida, loginInserido);}

    public double getSalario() {
        return salario;
    }



// Métodos
    @Override
    public void bonificacao() {
        System.out.println( this.getSalario() + (this.getSalario() * 0.05));
    }
}

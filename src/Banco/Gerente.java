package Banco;

import static Banco.Bancario.BonificacaoBancarios;

public class Gerente extends Funcionario{

    public Autenticacao gerenteAutenticacao;
    private double salario = 2700.00;


// Construtor
    public Gerente(String name,  int loginInserido, int senhaInserida) {
        super(name, senhaInserida, loginInserido);}

    public double getSalario() {
        return salario;
    }

    // Métodos

    @Override
    public void bonificacao() {
        System.out.println(this.getSalario() + (BonificacaoBancarios()/2));
    }
}

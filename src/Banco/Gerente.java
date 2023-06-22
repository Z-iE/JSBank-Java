package Banco;


public class Gerente extends Funcionario{
    private double salario = 2700.00;
    private static double numGerentes;

// Construtor
    public Gerente(String Nome,  String CPF, int Agencia) {
        super(Nome, CPF, Agencia);
        numGerentes++;
    }


    public double getSalario() {
        return salario;
    }

    public static double getNumGerentes() {
        return numGerentes;
    }
// Métodos

    @Override
    public void salarioFinal() {
        System.out.println("Bônus do gerente: " + ((Bancario.getBonificacaoBancarios()/2)/numGerentes));
        System.out.println("Salário final: " + (this.getSalario() + ((Bancario.getBonificacaoBancarios()/2)/numGerentes)));
    }

    @Override
    public void infoFuncionario() {
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Informações Sobre o Gerente:");
        System.out.println("Nome do gerente: " + this.getNome() + ".");
        System.out.println("Número do CPF: " + this.getCPF() + ".");
        System.out.println("Numero da agência de lotação: " + this.getAgencia() + "°");
        this.salarioFinal();
    }
}

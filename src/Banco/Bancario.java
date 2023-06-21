package Banco;

public class Bancario extends Funcionario{
    double salario = 1200.00;
    private double valorBonificacao;
    private static double bonificacaoBancarios;

    public Bancario(String nome, int loginInserido, int senhaInserida) {
        super(nome, senhaInserida, loginInserido);

    }

    public double getSalario() {
        return salario;
    }

    public double getValorBonificacao() {
        return valorBonificacao;
    }

    public void setValorBonificacao(double valorBonificacao) {
        this.valorBonificacao = valorBonificacao;
    }

    public static double BonificacaoBancarios() {
        return bonificacaoBancarios;
    }

    public static void setBonificacaoBancarios(double bonificacaoBancarios) {
        Bancario.bonificacaoBancarios += bonificacaoBancarios;
    }

    // Métodos

        protected void calculaBonificacao (double valor){
            if ((valor * 0.05) <= 2400){
                valorBonificacao += valor * 0.05;
                setBonificacaoBancarios(valor * 0.05);
                System.out.println(bonificacaoBancarios);
            } else {
                valorBonificacao = 2400;
                throw new IllegalStateException();
            }}

    @Override
    public void bonificacao() {
        System.out.println(this.getSalario() + this.getValorBonificacao());
    }
}

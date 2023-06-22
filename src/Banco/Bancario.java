package Banco;

import java.util.Scanner;

public class Bancario extends Funcionario{

    double salario = 1200.00;
    private double valorDaBonificacao;
    protected static double bonificacaoGerentes;
    Autenticacao bancarioAutenticacao;


    public Bancario(String nome, String CPF, int loginInserido, int senhaInserida) {
        super(nome, CPF, senhaInserida, loginInserido);
    }

    public double getSalario() {
        return salario;
    }

    public double getValorDaBonificacao() {
        return valorDaBonificacao;
    }

    public void setValorDaBonificacao(double valorDaBonificacao) {
        if(this.valorDaBonificacao < 4800 && valorDaBonificacao < 4800){
            this.valorDaBonificacao += valorDaBonificacao;}
        else {
            this.valorDaBonificacao = 4800;
        }
    }

    public static double getBonificacaoBancarios() {
        return bonificacaoGerentes;
    }

    // Bonificação do Gerente é dada pela soma das bonificações de todos os bancários;
    // Qando há mais que um gerente essa bonificação é dividida entre o total de gerentes e o teto limite aumenta;
    // O teto máximo de remuneração é de 4800 por bancário e para gerente o teto é multiplicado pelo total de gerentes;
    public void setBonificacaoGerentes(double bonificacaoGerentes) {
        double limite = 4800;
        if (Gerente.getNumGerentes() > 1){
            limite = 4800 * Gerente.getNumGerentes() * 2;
        }
        if (Bancario.bonificacaoGerentes < limite && bonificacaoGerentes < limite){
            Bancario.bonificacaoGerentes += bonificacaoGerentes;}
        else {
            Bancario.bonificacaoGerentes = limite;
        }
    }

    // Métodos

        protected void calculaBonificacao (double valor){
            if ((valor * 0.05) <= 2400){
                setValorDaBonificacao(valor * 0.05);
                setBonificacaoGerentes(valor * 0.05);
            } else {
                System.out.println("\nTeto da bonificação atingido se autentique para continuar.");
                throw new IllegalStateException();
           }
    }

    public void testeBonificacao (double valor, Bancario bancario){
     try{
        bancario.calculaBonificacao(valor);
     }catch (IllegalStateException limite){
        this.bancarioAutenticacao = new Autenticacao(bancario.getSenhaInserida(), bancario.getLoginInserido());
        Scanner entrada = new Scanner(System.in);
            System.out.println("Digite o login do Funcionário: ");
                int login = entrada.nextInt();
            System.out.println("Digite a senha do Funcionário: ");
                int senha = entrada.nextInt();
        if(bancarioAutenticacao.Autentica(login, senha)) {
            if (valor * 0.05 >= 4800) {
                bancario.setValorDaBonificacao(4800);
                bancario.setBonificacaoGerentes(valor * 0.05);
            } else {
                bancario.setValorDaBonificacao(valor * 0.05);
                bancario.setBonificacaoGerentes(valor * 0.05);
            }
        }
        else {
            bancario.setValorDaBonificacao(2400);
            bancario.setBonificacaoGerentes(2400);
            System.out.println("Usuário não autenticado, limite mantido.");}
        }
     }

    @Override
    public void salarioFinal() {
        System.out.println("Bônus do Bancário: R$" + this.getValorDaBonificacao());
        System.out.println("Salário Final: R$"+ (this.getSalario() + this.getValorDaBonificacao()));
    }

    @Override
    public void infoFuncionario() {
        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("Nome do Bancário: " + this.getNome());
        System.out.println("CPF do Bancário: " + this.getCPF());
        this.salarioFinal();
    }
}

package Banco;

import java.util.Scanner;

public class Capitalizacao implements calculaImposto{

    Autenticacao bancarioAutenticacao;
    double valorDaCapitalizacao;
    @Override
    public double taxaAdministrativa(double tempo) {
        return 5 * tempo;
    }

    @Override
    public double calculaTaxa(double tempo, double valor) {
        if(tempo <= 180){
            return (valor - (valor * 0.0225));}
        else if (tempo <= 360) {
            return  valor - (valor * 0.02);
        } else if (tempo <= 720) {
            return  valor - (valor * 0.0175);
        }
        else {
            return valor - (valor * 0.015);
        }
    }

    public void testeBonificacao (double valor, Bancario bancario){
        try{
            bancario.calculaBonificacao(valor);
        } catch (IllegalStateException limite){
            System.out.println("Limite Excedido");
        }finally {
            this.bancarioAutenticacao = new Autenticacao(bancario.getSenhaInserida(), bancario.getLoginInserido());
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite a senha");
            int senha = entrada.nextInt();
            System.out.println("Digite o login");
            int login = entrada.nextInt();

            if(bancarioAutenticacao.Autentica(login, senha)){
                if (valor * 0.05 >= 4800){
                bancario.setValorBonificacao(4800);
                ;}
                else {bancario.setValorBonificacao(valor);}
            }else {
                System.out.println("Usuário errado, limite mantido");

            }

        }
    }


    public void capitalizacaoSimples(double valorDaCapitalizacao, double tempo, Bancario bancario){
        testeBonificacao(valorDaCapitalizacao, bancario);
        valorDaCapitalizacao = valorDaCapitalizacao * ((0.08 * tempo) + 1);
        double total = calculaTaxa((tempo * 30), valorDaCapitalizacao) - taxaAdministrativa(tempo);
        System.out.printf("%.2f", total);
        System.out.println();

    }
    public void capitalizacaoComposta(double valorDaCapitalizacao, double tempo){
        valorDaCapitalizacao = valorDaCapitalizacao * Math.pow(1.08, tempo);
        double total = calculaTaxa(tempo * 30, valorDaCapitalizacao) - taxaAdministrativa(tempo);
        System.out.printf("%.2f", total);
    }
}

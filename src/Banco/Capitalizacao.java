package Banco;

public class Capitalizacao implements calculaImposto{


    protected double total;
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

    public void capitalizacaoSimples(double valorDaCapitalizacao, double tempo, Bancario bancario){
        bancario.testeBonificacao(valorDaCapitalizacao, bancario);
        valorDaCapitalizacao = valorDaCapitalizacao * ((0.15 * tempo) + 1);
        this.total = calculaTaxa((tempo * 30), valorDaCapitalizacao) - taxaAdministrativa(tempo);
    }
    public void capitalizacaoComposta(double valorDaCapitalizacao, double tempo, Bancario bancario){
        bancario.testeBonificacao(valorDaCapitalizacao, bancario);
        valorDaCapitalizacao = valorDaCapitalizacao * Math.pow(1.18, tempo);
        this.total = calculaTaxa(tempo * 30, valorDaCapitalizacao) - taxaAdministrativa(tempo);

    }
    public void infoCap(){
        System.out.printf("Valor investido em capitalização: R$%.2f", this.total);
        System.out.println();
    }
}

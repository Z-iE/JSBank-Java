package Banco;

public class Capitalizacao implements calculaImposto{

    double valorDaCapitalizacao;
    @Override
    public double taxaAdministrativa(double tempo) {
        return 50 * tempo;
    }

    @Override
    public double calculaTaxa(double tempo, double valor) {
        if(tempo <= 180){
            return valor - (valor * 0.225);} 
        else if (tempo <= 360) {
            return  valor - (valor * 0.2);
        } else if (tempo <= 720) {
            return  valor - (valor * 0.175);
        }
        else {
            return valor - (valor * 0.15);
        }
    }

    public void capitalizacaoSimples(double valorDaCapitalizacao, double tempo){
        valorDaCapitalizacao = valorDaCapitalizacao * ((0.08 * tempo) + 1);
        System.out.println(calculaTaxa(tempo * 30, valorDaCapitalizacao) - taxaAdministrativa(tempo));
    }
    public void capitalizacaoComposta(double valorDaCapitalizacao, double tempo){
        valorDaCapitalizacao = valorDaCapitalizacao * Math.pow(1.08, tempo);
        double total = calculaTaxa(tempo * 30, valorDaCapitalizacao) - taxaAdministrativa(tempo);
        System.out.printf("%.2f", total);
    }
}

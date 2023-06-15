package Banco;

public class Seguro implements calculaImposto{

    @Override
    public double taxaAdministrativa(double tempo) {
        return 30 * tempo;
    }

    @Override
    public double calculaTaxa(double valor, double pessoas) {
        return valor - (pessoas * 180);
    }

    public void seguroSimples(double valorDaCapitalizacao, double tempo, double pessoas){
        valorDaCapitalizacao = valorDaCapitalizacao * ((0.05 * tempo) + 1);
        System.out.println(calculaTaxa(valorDaCapitalizacao, pessoas) - taxaAdministrativa(tempo));
    }
    public void seguroComposto(double valorDaCapitalizacao, double tempo, double pessoas){
        valorDaCapitalizacao = valorDaCapitalizacao * Math.pow(1.08, tempo);
        double total = calculaTaxa(valorDaCapitalizacao, pessoas) - taxaAdministrativa(tempo);
        System.out.printf("%.2f", total);
    }

}

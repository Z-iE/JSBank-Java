package Banco;

public class Seguro implements calculaImposto{

    @Override
    public double taxaAdministrativa(double tempo) {
        return 5 * tempo;
    }

    @Override
    public double calculaTaxa(double valor, double pessoas) {
        return valor - (pessoas * 80);
    }

    public void seguroSimples(double valorDoSeguro, double tempo, double pessoas){
        if(valorDoSeguro >= (pessoas * 160)){
            valorDoSeguro = valorDoSeguro * ((0.05 * tempo) + 1);
        System.out.println(calculaTaxa(valorDoSeguro, pessoas) - taxaAdministrativa(tempo));}
        else {
            System.out.println("Valor insuficiente para seguro");
        }
    }
    public void seguroComposto(double valorDaCapitalizacao, double tempo, double pessoas){
        valorDaCapitalizacao = valorDaCapitalizacao * Math.pow(1.08, tempo);
        double total = calculaTaxa(valorDaCapitalizacao, pessoas) - taxaAdministrativa(tempo);
        System.out.printf("%.2f", total);
    }

}

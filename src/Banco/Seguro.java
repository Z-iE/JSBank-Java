package Banco;

public class Seguro implements calculaImposto{
    protected double total;

    @Override
    public double taxaAdministrativa(double tempo) {
        return 5 * tempo;
    }

    @Override
    public double calculaTaxa(double valor, double pessoas) {
        return valor - (pessoas * 80);
    }

    public void seguroSimples(double valorDoSeguro, double tempo, double pessoas, Bancario bancario){
        if(valorDoSeguro >= (pessoas * 160)){
            bancario.testeBonificacao(valorDoSeguro, bancario);
            valorDoSeguro = valorDoSeguro * ((0.05 * tempo) + 1);
        this.total = calculaTaxa(valorDoSeguro, pessoas) - taxaAdministrativa(tempo);}
        else {
            System.out.println("Valor insuficiente para a contratação do seguro;");
        }
    }
    public void seguroComposto(double valorDoSeguro, double tempo, double pessoas, Bancario bancario){
        if(valorDoSeguro >= (pessoas * 160)){
            bancario.testeBonificacao(valorDoSeguro, bancario);
        valorDoSeguro = valorDoSeguro * Math.pow(1.08, tempo);
        this.total = calculaTaxa(valorDoSeguro, pessoas) - taxaAdministrativa(tempo);
        }else {
            System.out.println("Valor insuficiente para a contratação do seguro;");
        }
    }
    public void infoSeguro(){
        System.out.printf("Valor de retorno do seguro contratado: R$%.2f", this.total);
        System.out.println();
    }

}

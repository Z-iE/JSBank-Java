package Banco;

public class contaPoupanca extends Contas {
    private double selic = 13.75;
    private double depositoRemunerado;

    public contaPoupanca(int numeroConta, int numeroAgencia, String nome, String CPF, int senhaInserida, String loginInserido) {
        super(numeroConta, numeroAgencia, nome, CPF, senhaInserida, loginInserido);
    }


    public void depositoRemunerado(double meses, double deposito){
        this.depositoRemunerado = deposito;
        String tempo;
        if (meses > 1){
            tempo = "meses";}
            tempo = "mês";
        System.out.println("Seu deposito foi aplicado você tera o retorno de: R$" + (calculaRemuneracao(meses) - deposito )+ " em " +
                (int) meses + " " + tempo + ".");

    }

    public double calculaRemuneracao(double meses) {
        if (selic < 8.5) {
            return depositoRemunerado = depositoRemunerado * ((0.7 * selic) + 1) * meses;
        } else {
            return depositoRemunerado = depositoRemunerado * 1.05 * meses;
        }
    }
}


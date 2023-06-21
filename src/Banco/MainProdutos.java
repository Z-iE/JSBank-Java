package Banco;

public class MainProdutos {
    public static void main(String[] args) {

        // Criar uma static que a cada capitalização feita um bancário é compensado;
        // Criar uma própria autenticação pros bancários na hora da venda;
        // Bonificação do gerente em cima da bonificação dos bancários;


        Cliente pedro = new Cliente("Paulo Neves", "918-192-119.28", 182, 123 );

        Bancario ruan = new Bancario("ruan", 123, 111);
        pedro.Capitalizacao();


       pedro.cap.capitalizacaoSimples(60000, 1, ruan);

       ruan.bonificacao();
       Gerente jose = new Gerente("jose", 123, 122);
       jose.bonificacao();


    }
}

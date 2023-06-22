package Banco;

public class MainProdutos {
    public static void main(String[] args) {
        //Os bancários recebem 5% do valor inicial do investimento como bônus;
        //Os gerentes recebem metade do valor total da soma do bônus de todos os bancários;
        //O valor do bônus dos gerentes é divido pelo total de gerentes;

        Bancario tiago = new Bancario("Tiago Martins", "172.462.193-13", 145, 198);
        Bancario maria = new Bancario("Maria Martins", "122.718.019-21", 146, 201);
        Gerente bernado = new Gerente("Bernado Silva", "817.391.245-95", 2261);
        Gerente luiza = new Gerente("Luiza Fernandes", "918.134.284-23", 2261);

        Cliente julia = new Cliente("Júlia Ferraz","871.246.012-81", 334, 8713);

        // Criação de uma capitalização e seguro para a Júlia.
        julia.Capitalizacao();
        julia.Seguro();

        // Capitalização
        julia.cap.capitalizacaoSimples(500, 2, tiago);

        julia.cap.capitalizacaoSimples(500, 2, tiago);


        /**bernado.infoFuncionario();
        maria.infoFuncionario();
        tiago.infoFuncionario();
        luiza.infoFuncionario();**/

        // Teste teto da bonificação
        //julia.seguro.seguroSimples(19800000, 1, 1, tiago);
        /**julia.infoCliente();
        tiago.infoFuncionario();
        bernado.infoFuncionario();
        maria.infoFuncionario();**/

        Cliente marcos = new Cliente("Marcos Ferreira", "771.172.182-91", 871, 192);
        marcos.Capitalizacao();
        marcos.cap.capitalizacaoSimples(100, 1, maria);
        marcos.infoCliente();
        tiago.infoFuncionario();
        bernado.infoFuncionario();
        maria.infoFuncionario();



    }
}

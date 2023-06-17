package Banco;

public class MainConta {



    public static void main(String[] args) {

        // Criação de um cliente com conta corrente, deposito, saque;
        Cliente paulo = new Cliente("Paulo Gomes", "189.234.192-12", 123, 2,111, 10);
        paulo.contaC.depositar(100, "189.234.192-12");
        paulo.contaC.sacar(20);

        // Criação de um cliente com conta poupança, deposito, transferência e deposito remunerado;
        Cliente julia = new Cliente("Julia Silva", "123.345.819-12", 111, 1, 991, 120);
        julia.contaP.depositar(500,"123.345.819-12");

        // Teste de Transferência com CPF errado.
        julia.contaP.transferir(100, julia.contaP, paulo.contaC,"182.234.192-12");

        // CPF correto
        julia.contaP.transferir(100, julia.contaP, paulo.contaC,"189.234.192-12");

        // Deposito remunerado
        julia.contaP.depositoRemunerado();

        // Apresentação da conta
        julia.contaP.conta();

    }
}

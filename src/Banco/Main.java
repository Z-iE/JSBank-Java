package Banco;

public class Main {

    //Digite: nome, CPF, login, senha
    // ou adicione o tipo de conta, poupança (1) e corrente (2), o número da conta a agência

    public static void main(String[] args) {
        Cliente pedro = new Cliente("Pedro Martins", "192.121.192-12", "login",
                120, 1, 123, 189 );
        pedro.contaP.saldo();
        pedro.contaP.depositar(100);
        pedro.contaP.sacar(50);


    }
}

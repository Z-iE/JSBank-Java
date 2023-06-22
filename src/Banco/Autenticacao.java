package Banco;

public class Autenticacao {
    // -- Atributos necessários para autenticação;
    private int senhaCliente;
    private int contaDoCliente;

    // -- Atributos necessários para autenticação;
    public Autenticacao(int senhaInserida, int loginInserido) {
       this.senhaCliente = senhaInserida;
       this.contaDoCliente = loginInserido;
    }

    // -- Método de autenticação recebe o login (número da conta) e a senha do cliente;
    public boolean Autentica(int loginInserida, int senhaInserida){
        if (this.senhaCliente == senhaInserida && this.contaDoCliente == loginInserida){
            System.out.println("\nUsuário logado.");
            return true;
        }
        else {
            System.out.println("\nLogin errado.");
            return false;
        }
    }
}


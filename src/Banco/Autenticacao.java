package Banco;

public class Autenticacao {

    private int senhaInserida;
    private int senhaClasse;
    private String login;
    private String loginInserido;

    public Autenticacao(int senhaInserida, int senhaClasse, String login, String loginInserido) {
       this.senhaInserida = senhaInserida;
       this.senhaClasse = senhaClasse;
       this.login = login;
       this.loginInserido = loginInserido;
    }

    public boolean Autentica(){
        if (this.senhaInserida == this.senhaClasse && this.login.equals(this.loginInserido)){
            System.out.println("Usuário logado");
            return true;
        }
        else {
            System.out.println("Login errado");
            return false;
        }
    }
}


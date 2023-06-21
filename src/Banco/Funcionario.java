package Banco;

public abstract class Funcionario {
    private String nome;
    private int senhaInserida;
    private int loginInserido;
    public Autenticacao autenticacao;

// Construtor
    public Funcionario(String nome, int senhaInserida, int loginInserido) {
        this.nome = nome;
        this.senhaInserida = senhaInserida;
        this.loginInserido = loginInserido;
        this.autenticacao = new Autenticacao(senhaInserida, loginInserido);
    }

// Getters e Setters


    public String getNome() {
        return nome;
    }

    public int getSenhaInserida() {
        return senhaInserida;
    }

    public int getLoginInserido() {
        return loginInserido;
    }

    // Métodos
        public abstract void bonificacao();

}

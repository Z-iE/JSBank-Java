package Banco;

public abstract class Funcionario {
    private String nome;
    private int senhaInserida;
    private String loginInserido;

// Construtor
    public Funcionario(String nome, int senhaInserida, String loginInserido) {
        this.nome = nome;
        this.senhaInserida = senhaInserida;
        this.loginInserido = loginInserido;
    }

// Getters e Setters
    public String getNome() {
        return nome;
    }

    public int getSenhaInserida() {
        return senhaInserida;
    }



    public String getLoginInserido() {
        return loginInserido;
    }

    public Funcionario(String loginInserido) {
        this.loginInserido = loginInserido;
    }

    // Métodos
    public abstract void bonificacao();

}

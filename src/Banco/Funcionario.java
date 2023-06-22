package Banco;

public abstract class Funcionario {
    private String nome;
    private String CPF;
    private int agencia;
    private int senhaInserida;
    private int loginInserido;
    public Autenticacao autenticacao;

// Construtor

    public Funcionario(String nome, String CPF, int agencia) {
        this.nome = nome;
        this.CPF = CPF;
        this.agencia = agencia;
    }

    public Funcionario(String nome, String CPF, int senhaInserida, int loginInserido) {
        this.nome = nome;
        this.senhaInserida = senhaInserida;
        this.CPF = CPF;
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

    public String getCPF() {
        return CPF;
    }

    public int getAgencia() {
        return agencia;
    }

    // Métodos
        public abstract void salarioFinal();
        public abstract void infoFuncionario();
}

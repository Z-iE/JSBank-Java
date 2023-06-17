package Banco;

public class Gerente extends Funcionario{

    public Autenticacao gerenteAutenticacao;
    private int senhaTodosGerentes = 220;
    private String loginTodosGerentes = "gerentelogin";

// Construtor
    public Gerente(String name, int senhaInserida, int salario, String loginInserido) {
        super(name, senhaInserida, salario, loginInserido);

        //this.gerenteAutenticacao = new Autenticacao(senhaInserida, this.getSenhaTodosGerentes(),
                //loginInserido, this.getLoginTodosGerentes());
    }


// Getters e Setters
    public int getSenhaTodosGerentes() {
        return senhaTodosGerentes;
    }

    public String getLoginTodosGerentes() {
        return loginTodosGerentes;
    }

// Métodos
    @Override
    public void bonificacao() {
        System.out.println( this.getSalario() + (this.getSalario() * 0.05));
    }
}

package Banco;

public class Bancario extends Funcionario{
    public Autenticacao bancarioAutenticacao;
    private int senhaTodosBancarios = 320;
    private String loginTodosBancarios = "bancariologin";

// Construtor
    public Bancario(String name, int senhaInserida, double salario, String loginInserido) {
        super(name, senhaInserida, salario, loginInserido);

        this.bancarioAutenticacao = new Autenticacao(senhaInserida, this.getSenhaTodosBancarios(),
                loginInserido, this.getLoginTodosBancarios());
    }

// Getter e Setters
    public int getSenhaTodosBancarios() {
        return senhaTodosBancarios;
    }

    public String getLoginTodosBancarios() {
        return loginTodosBancarios;
    }

// Métodos
    @Override
    public void bonificacao() {
        System.out.println( this.getSalario() + (this.getSalario() * 0.2));
    }
}

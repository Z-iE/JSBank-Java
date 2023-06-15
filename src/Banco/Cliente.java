package Banco;

public class Cliente {

    private String name;
    private String CPF;
    private int senhaTodosClientes = 120;
    private int senhaInserida;
    private String loginTodosClientes = "login";
    protected Autenticacao clienteAutenticacao;
    protected contaPoupanca contaP;
    protected contaCorrente contaC;

// Construtor



    public Cliente(String name, String CPF, String loginInserido, int senhaInserida) {
        this.name = name;
        this.CPF = CPF;
        this.senhaInserida = senhaInserida;
        this.clienteAutenticacao = new Autenticacao(senhaInserida, this.senhaTodosClientes, loginInserido, this.loginTodosClientes);

    }

    public Cliente(String name, String CPF, String loginInserido, int senhaInserida, int tipoDeConta, int numeroConta, int agencia) {
        this.name = name;
        this.CPF = CPF;
        this.senhaInserida = senhaInserida;
        this.clienteAutenticacao = new Autenticacao(senhaInserida, this.getSenhaTodosClientes(), loginInserido, this.getloginTodosClientes());

        if (tipoDeConta == 1){
            this.contaP = new contaPoupanca(numeroConta, agencia, name, CPF, senhaInserida, loginInserido);
        } else if (tipoDeConta == 2) {
            this.contaC  = new contaCorrente(numeroConta, agencia, name, CPF, senhaInserida, loginInserido);
        }
    }

// Getters e Setters
    public String getName() {
        return name;
    }

    public String getCPF() {
        return CPF;
    }


    public int getSenhaTodosClientes() {
        return senhaTodosClientes;
    }

    public int getSenhaInserida() {
        return senhaInserida;
    }
    public String getloginTodosClientes() {
        return loginTodosClientes;
    }


}

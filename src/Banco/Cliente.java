package Banco;

public class Cliente {

    // -- Atributos
    // -- O cliente TEM UM nome, CPF, senha de login e número de conta para login, também possui uma autenticação
    //    e o cliente TEM UMA conta poupança ou corrente;
    private String nome;
    private String CPF;
    private int senhaDoCliente;
    private int loginContaDoCliente;
    protected Autenticacao clienteAutenticacao;
    protected contaPoupanca contaP;
    protected contaCorrente contaC;
    protected Capitalizacao cap;
    protected Seguro seguro;

    // -- Construtor usado quando é criado uma conta sem passar pelo cliente;
    public Cliente(String nome, String CPF, int contaInserida, int senhaInserida) {
        this.nome = nome;
        this.CPF = CPF;
        this.senhaDoCliente = senhaInserida;
        this.loginContaDoCliente = contaInserida;
        this.clienteAutenticacao = new Autenticacao(this.senhaDoCliente, this.loginContaDoCliente);

    }
    // -- Construtor usado quando é criado um cliente para então gerar a conta;
    public Cliente(String nome, String CPF, int senhaInserida, int tipoDeConta, int numeroConta, int agencia) {
        this.nome = nome;
        this.CPF = CPF;
        this.senhaDoCliente = senhaInserida;
        this.loginContaDoCliente = numeroConta;
        this.clienteAutenticacao = new Autenticacao(this.senhaDoCliente, this.loginContaDoCliente);


        // -- Teste para saber que tipo de conta será: 1 Poupança, 2 Corrente;
        if (tipoDeConta == 1){
            this.contaP = new contaPoupanca(numeroConta, agencia, nome, CPF, senhaInserida);
        } else if (tipoDeConta == 2) {
            this.contaC  = new contaCorrente(numeroConta, agencia, nome, CPF, senhaInserida);
        }
    }

    public void Capitalizacao (){
        this.cap = new Capitalizacao();
    }

    public void Seguro(){
        this.seguro = new Seguro();
    }

// Getters e Setters
    public String getNome() {
        return nome;
    }
    public String getCPF() {
        return CPF;
    }
    public int getSenhaDoCliente() {
        return senhaDoCliente;
    }
    public int getLoginContaDoCliente() {
        return loginContaDoCliente;
    }
    public Autenticacao getClienteAutenticacao() {
        return clienteAutenticacao;
    }
    public contaPoupanca getContaP() {
        return contaP;
    }
    public contaCorrente getContaC() {
        return contaC;
    }
}

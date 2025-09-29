package Etapa1;

public class Usuario {

    protected String nome;
    protected String email;
    protected String cpf;
    protected String endereco;
    protected int idade;
    protected int numCard;
    protected String senha;
    protected String cargo;

    public Usuario(String nome, String email, String cpf, String endereco, int idade, int numCard, String senha) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.endereco = endereco;
        this.idade = idade;
        this.numCard = numCard;
        this.senha = senha;
    }

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumCard() {
        return numCard;
    }

    public void setNumCard(int numCard) {
        this.numCard = numCard;
    }

    public String verDadosAdm() {
        return "\nNome: " + getNome()
                + "\nE-mail: " + getEmail()
                + "\nSenha: " + getSenha() + "\n";
    }

    public void verDadosUser() {
        System.out.println("\nNome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("E-mail: " + getEmail());
        System.out.println("Senha: " + getSenha());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Número cartão: " + getNumCard() + "\n");
    }

}

package Etapa1;

import java.time.LocalDate;

public class Produtos {
    protected String nomeProduto;
    protected double preco;
    private LocalDate dataEntrega;
    protected String desc;
    protected String cor;
    
    public Produtos(){
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.dataEntrega = dataEntrega;
        this.desc = desc;
        this.cor = cor;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public void cadastro(){
        System.out.println("\nProduto cadastrado!");
        System.out.println("---- Dados do Produto ----");
        System.out.println("Título: " + getNomeProduto());
        System.out.println("Preço: " + getPreco());
        System.out.println("Descrição: " + getCor());
        System.out.println("Cor: " + getDesc() + "\n");
    }
    
}

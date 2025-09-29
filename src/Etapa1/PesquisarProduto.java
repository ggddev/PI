package Etapa1;

import java.util.ArrayList;
import java.util.List;

public class PesquisarProduto {
    String nomePesquisa;
    List<Produtos> lista = new ArrayList<>();

    public PesquisarProduto(String nomePesquisa, List lista) {
        this.nomePesquisa = nomePesquisa;
        this.lista = lista;
    }

    public void pesquisarProduto() {
        boolean encontrado = false;

        for (Produtos prod : lista) {
            if (nomePesquisa.equalsIgnoreCase(prod.getNomeProduto())) {
                System.out.println("\nTítulo: " + prod.getNomeProduto());
                System.out.printf("Preço: R$ %.2f%n", prod.getPreco());
                System.out.println("Descrição: " + prod.getDesc() + "\n");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("\nProduto não encontrado.\n");
        }
    }
}

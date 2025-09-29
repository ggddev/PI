package Etapa1;

import java.util.ArrayList;
import java.util.List;

public class PesquisarUsuario {

    private String nomePesquisa;
    List<Usuario> listaNomes = new ArrayList<>();

    public PesquisarUsuario(String nomePesquisa, List listaNomes) {
        this.nomePesquisa = nomePesquisa;
        this.listaNomes = listaNomes;
    }

    public void pesquisarUsuario() {
        boolean encontrado = false;

        for (Usuario user : listaNomes) {
            if (nomePesquisa.equalsIgnoreCase(user.getNome())) {
                System.out.println("\nNome: " + user.getNome());
                System.out.println("Idade: " + user.getIdade());
                System.out.println("E-mail: " + user.getEmail());
                System.out.println("Senha: " + user.getSenha());
                System.out.println("Endereço: " + user.getEndereco() + "\n");
                encontrado = true;
            }
        }
        
        if(!encontrado){
            System.out.println("\nUsuário não encontrado.\n");
        }
    }
}

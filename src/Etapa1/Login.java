package Etapa1;

import java.util.List;
import java.util.Scanner;

public class Login {

    Scanner in = new Scanner(System.in);

    public Usuario fazerLogin(List<Usuario> usuariosSistemas) {
        System.out.println("Informe seu e-mail: ");
        String email = in.nextLine();
        System.out.println("Informe sua senha: ");
        String senha = in.nextLine();

        for (Usuario user : usuariosSistemas) {
            if (user.getEmail().equalsIgnoreCase(email) && user.getSenha().equalsIgnoreCase(senha)) {
                System.out.println("Login efetuado com sucesso!");
                return user;
            }
        }
        
        System.out.println("E-mail ou senha incorretos, tente novamente.");
        return null;
    }
}

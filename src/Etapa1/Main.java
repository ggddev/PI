package Etapa1;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Produtos> produtosLista = new ArrayList<>();
        List<Usuario> usuariosSistema = new ArrayList<>();
        byte respAdm;
        String continuar = "";

        do {
            System.out.println("Olá! Bem-vindo ao novo sistema da GRIS Comércios! Por favor, para continuar, faça o cadastro.");

            System.out.println("Informe se você é um [A]dministrador do Sistema, ou um [U]suário: ");
            String admOrUser = in.nextLine().toUpperCase();

            if (admOrUser.equals("A")) {
                System.out.println("Informe seu nome: ");
                String nomeAdm = in.nextLine();
                System.out.println("Informe seu e-mail: ");
                String emailAdm = in.nextLine();
                System.out.println("Crie sua senha: ");
                String senhaAdm = in.nextLine();

                Usuario userAdm = new Usuario(nomeAdm, emailAdm, senhaAdm);

                usuariosSistema.add(userAdm);

                //Nessa parte de Login aqui no Main, pode ser substituida pela classe Login, entao marque para se precisar apagar
                System.out.println("Cadastro concluído com sucesso! Agora, por favor, faça login no sistema: ");

                Login login = new Login();
                Usuario usuarioLogado = login.fazerLogin(usuariosSistema);

                if (usuarioLogado != null) {

                    do {

                        System.out.println("Informe o que você deseja fazer: (1) Cadastrar novo produto | (2) Verificar usuário | (3) Verificar dados | (4) Pesquisar produto | (5) Sair");
                        respAdm = in.nextByte();
                        in.nextLine();

                        if (respAdm == 1) {
                            Produtos produtos = new Produtos();
                            
                            System.out.println("Informe o nome do Produto: ");
                            produtos.setNomeProduto(in.nextLine()); //crie o laço de repeticao aq
                            System.out.println("Informe o preço do Produto: ");
                            produtos.setPreco(in.nextDouble());
                            in.nextLine();
                            System.out.println("Informe a cor do Produto: ");
                            produtos.setCor(in.nextLine());
                            System.out.println("Descrição do Produto: ");
                            produtos.setDesc(in.nextLine());

                            produtosLista.add(produtos);//colocamos ele na lista

                            produtos.cadastro();
                        } else if (respAdm == 2) {
                            System.out.println("Informe o nome do usuário que deseja verificar: ");
                            String nomeBusca = in.nextLine();

                            PesquisarUsuario buscaUser = new PesquisarUsuario(nomeBusca, usuariosSistema);

                            buscaUser.pesquisarUsuario();

                        } else if (respAdm == 3) {
                            System.out.println("Para acessar seus dados, precisamos que você insira sua senha novamente, por questões de proteção: ");
                            String senhaVerDados = in.nextLine();

                            if (senhaVerDados.equals(userAdm.getSenha())) {
                                System.out.println(userAdm.verDadosAdm());
                            } else {
                                System.out.println("Senha incorreta.");
                            }
                        } else if (respAdm == 4) {
                            System.out.println("Informe o nome do produto: ");
                            String nomePesquisa = in.nextLine();

                            PesquisarProduto buscaProduto = new PesquisarProduto(nomePesquisa, produtosLista);
                            
                            buscaProduto.pesquisarProduto();
                        }

                    } while (respAdm == 1 || respAdm == 2 || respAdm == 3 || respAdm == 4);

                } else {
                    System.out.println("E-mail ou senha incorretos, tente novamente mais tarde.");
                }
            } else if (admOrUser.equals("U")) {
                System.out.println("Informe seu nome: ");
                String nomeUser = in.nextLine();
                System.out.println("Informe seu e-mail: ");
                String email = in.nextLine();
                System.out.println("Informe sua idade: ");
                int idade = in.nextInt();
                in.nextLine();
                System.out.println("Informe seu CPF: ");
                String cpf = in.nextLine();
                System.out.println("Informe seu endereço: ");
                String endereco = in.nextLine();
                System.out.println("Informe o número do cartão: ");
                int numCard = in.nextInt();
                in.nextLine();
                System.out.println("Crie uma senha: ");
                String senhaUser = in.nextLine();

                Usuario userComum = new Usuario(nomeUser, email, cpf, endereco, idade, numCard, senhaUser);
                usuariosSistema.add(userComum);

                if (nomeUser.isEmpty() || email.isEmpty() || cpf.isEmpty() || endereco.isEmpty()) {
                    System.out.println("Por favor, insira uma resposta válida!");
                } else {
                    System.out.println("Sua conta foi criada! Iremos te redirecionar para a página de login. Aguarde um instante...");

                    Login login = new Login();
                    Usuario usuarioLogado = login.fazerLogin(usuariosSistema);

                    if (usuarioLogado != null) {
                        byte resp;
                        do {
                            System.out.println("Informe o que deseja fazer: (1) Comprar | (2) Verificar seus dados | (3) Sair");
                            resp = in.nextByte();
                            in.nextLine();

                            if (resp == 1) {
                                Produtos produtos = new Produtos();
                                
                                System.out.println("Pesquisar Produto: ");
                                String pesquisarNome = in.nextLine();

                                PesquisarProduto search = new PesquisarProduto(pesquisarNome, produtosLista);

                                search.pesquisarProduto();
                                
                                System.out.println("Deseja realizar esta compra? ( S / N )");
                                String confirmacaoCompra = in.nextLine();

                                if (confirmacaoCompra.equalsIgnoreCase("s")) {
                                    System.out.println("Para confirmar a compra, insira o número do seu cartão abaixo: ");
                                    int numCardConfirmar = in.nextInt();
                                    in.nextLine();

                                    if (numCardConfirmar == userComum.getNumCard()) {
                                        System.out.println("\nCompra confirmada!\n");

                                        produtos.setDataEntrega(LocalDate.now().plusDays(25));
                                        System.out.println("Seu " + pesquisarNome + " chegará no dia: " + produtos.getDataEntrega());
                                    } else {
                                        System.out.println("Número do cartão incorreto.");
                                    }
                                }

                            } else if (resp == 2) {
                                System.out.println("Para acessar seus dados, precisamos que você insira sua senha novamente, por questões de proteção: ");
                                String senhaVerDados = in.nextLine();

                                if (senhaVerDados.equals(userComum.getSenha())) {
                                    userComum.verDadosUser();
                                } else {
                                    System.out.println("Senha incorreta.");
                                }
                            }
                        } while (resp == 1 || resp == 2);
                    } else {
                        System.out.println("E-mail ou senha incorretos. Tente novamente.");
                    }
                }
            }
            System.out.println("Deseja cadastrar mais algum usuário? ( S / N )");
            continuar = in.nextLine();
        } while (continuar.equalsIgnoreCase("s"));
    }
}

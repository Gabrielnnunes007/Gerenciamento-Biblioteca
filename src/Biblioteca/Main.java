package Biblioteca;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Estoque estoque = new Estoque();
        Scanner scanner = new Scanner(System.in);
            int menuPrincial = 0;
            while (menuPrincial != 5){
                menu.menuPrincipal();
                menuPrincial = scanner.nextInt();

                switch (menuPrincial) {
                    case 1:
                        int opcaoLivro = 0;
                        while (opcaoLivro != 5) {
                            menu.menuLivro();
                            opcaoLivro = scanner.nextInt();

                            switch (opcaoLivro) {
                                case 1:
                                    System.out.println("===== CADASTRAR LIVRO =====");
                                    Livro livro = new Livro();

                                    System.out.println("Digite o Titulo do Livro: ");
                                    scanner.nextLine();
                                    livro.setTitulo(scanner.nextLine().toUpperCase());

                                    System.out.println("Digite o Autor do Livro: ");
                                    livro.setAutor(scanner.nextLine().toUpperCase());

                                    while(true) {
                                        try {
                                            System.out.println("Digite o ISBN do Livro: ");
                                            livro.setIsbn(scanner.nextInt());
                                            break;
                                        } catch (InputMismatchException e) {
                                            System.out.println("Número Inválido. Tente somente numeros inteiros: ");
                                            scanner.nextLine();
                                        }
                                    }

                                    System.out.println("Digite a Editora do Livro: ");
                                    scanner.nextLine();
                                    livro.setEditora(scanner.nextLine().toUpperCase());

                                    System.out.println("Digite o Gênero do Livro: ");
                                    livro.setGenero(scanner.nextLine().toUpperCase());

                                    while(true) {
                                        try {
                                            System.out.println("Digite o Número de Páginas do Livro: ");
                                            livro.setNumero_paginas(scanner.nextInt());
                                            break;
                                        } catch (InputMismatchException e) {
                                            System.out.println("Número Inválido. Tente somente numeros inteiros: ");
                                            scanner.nextLine();
                                        }
                                    }

                                    while(true) {
                                        try {
                                            System.out.println("Digite a Quantidade do Livro: ");
                                            livro.setQuantidade(scanner.nextInt());
                                            break;
                                        } catch (InputMismatchException e) {
                                            System.out.println("Número Inválido. Tente somente numeros inteiros: ");
                                            scanner.nextLine();
                                        }
                                    }
                                    estoque.adicionarLivro(livro);
                                    break;
                                case 2:
                                    System.out.println("===== EDITAR LIVRO =====");
                                    estoque.menuEditarLivro();
                                    break;
                                case 3:
                                    System.out.println("===== REMOVER LIVRO =====");
                                    while(true) {
                                        try {
                                            System.out.println("Digite o ISBN do Livro: ");
                                            int livroDesejado = scanner.nextInt();
                                            estoque.removerLivro(livroDesejado);
                                            break;
                                        } catch (InputMismatchException e) {
                                            System.out.println("Número Inválido. Tente somente numeros inteiros: ");
                                            scanner.nextLine();
                                        }
                                    }
                                    break;
                                case 4:
                                    System.out.println("===== LISTAR LIVRO =====");
                                    estoque.listarLivros();
                                    break;
                                case 5:
                                    System.out.println("+++++ RETORNAR +++++\n");
                                    break;
                                default:
                                    System.out.println("Opção Inválida. Tente novamente: ");
                            }
                        }
                        break;

                    case 2:
                        menu.menuPessoa();
                        int opcaoPessoa = 0;
                        while (opcaoPessoa != 5) {
                            menu.menuPessoa();
                            opcaoPessoa = scanner.nextInt();

                            switch (opcaoPessoa) {
                                case 1:
                                    Pessoa pessoa = new Pessoa();
                                    System.out.println("Digite o nome da pessoa: ");
                                    pessoa.setNome(scanner.next().toUpperCase());

                                    while (true) {
                                        try {
                                            System.out.println("Digite a idade da pessoa: ");
                                            pessoa.setIdade(scanner.nextInt());
                                            scanner.nextLine();
                                            break;
                                        } catch (InputMismatchException e) {
                                            System.out.println("Número Inválido. Tente somente numeros inteiros: ");
                                            scanner.nextLine();
                                        }
                                    }
                                    estoque.adicionarPessoa(pessoa);
                                    break;
                                case 2:
                                    estoque.listarPessoas();
                                    System.out.println("Digite");
                                case 3:
                                    break;
                                case 4:
                                    break;
                                case 5:
                                    break;
                                default:
                                    System.out.println("Opção Inválida. Tente novamente: ");
                            }
                        }
                        break;

                    case 3:
                        menu.menuEstoque();
                        break;

                    case 4:
                        menu.menuEmpretimo();
                        break;

                    case 5:
                        System.out.println("Deseja mesmo sair: ");
                        System.out.println("1 - SIM ");
                        System.out.println("2 - NÃO ");
                        int saida = scanner.nextInt();
                        switch (saida) {
                            case 1:
                                System.out.println("Encerrando programa");
                                System.exit(0);

                            case 2:
                                System.out.println("Retornando ao menu Principal");
                                menuPrincial = 0;
                            default:
                                System.out.println("Opção Inválida. Tente novamente: ");
                        }
                }
            }
        }
    }

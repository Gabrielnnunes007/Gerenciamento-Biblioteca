package Biblioteca;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Estoque estoque = new Estoque();
        Scanner scanner = new Scanner(System.in);
            int menuPrincial = 0;
            while (menuPrincial != 5){
                sistema.menuPrincipal();
                menuPrincial = scanner.nextInt();

                switch (menuPrincial) {
                    case 1:
                        int opcaoLivro = 0;
                        while (opcaoLivro != 5) {
                            sistema.menuLivro();
                            opcaoLivro = scanner.nextInt();

                            switch (opcaoLivro) {
                                case 1:
                                    System.out.println("===== CADASTRAR LIVRO =====");
                                    Livro livro = new Livro();

                                    System.out.println("Digite o Titulo do Livro: ");
                                    scanner.nextLine();
                                    livro.setTitulo(scanner.nextLine());

                                    System.out.println("Digite o Autor do Livro: ");
                                    livro.setAutor(scanner.nextLine());

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
                                    livro.setEditora(scanner.nextLine());

                                    System.out.println("Digite o Gênero do Livro: ");
                                    livro.setGenero(scanner.nextLine());

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
                                    break;
                                case 3:
                                    System.out.println("===== REMOVER LIVRO =====");
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
                        sistema.menuUsuario();
                        break;

                    case 3:
                        sistema.menuEstoque();
                        break;

                    case 4:
                        sistema.menuEmpretimo();
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

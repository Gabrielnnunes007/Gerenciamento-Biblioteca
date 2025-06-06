package Biblioteca;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Estoque {
    Scanner scanner = new Scanner(System.in);
    private final ArrayList<Livro> livros;
    private final ArrayList<Pessoa> pessoas;

    public Estoque(){
        this.livros = new ArrayList<>();
        this.pessoas = new ArrayList<>();
    }
    public void adicionarLivro(Livro livro) {
        for (Livro l : livros) {
            if(l.getIsbn() == livro.getIsbn()) {
                l.setQuantidade(l.getQuantidade() + l.getQuantidade());
                System.out.println("Livro " + l.getTitulo() + " foi adicionado com sucesso");
                System.out.println("Quantidade atualizada: " + l.getQuantidade());
                return;
            }
        }
        livros.add(livro);
        System.out.println("Livro " + livro.getTitulo() + " foi adicionado com sucesso");
    }

    public void removerLivro() {
        int isbn;
        while (true) {
            try {
                System.out.println("Digite o ISBN do livro que deseja editar: ");
                isbn = scanner.nextInt();
                scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro: ISBN inválido! Digite apenas números inteiros.");
                scanner.nextLine();
            }
        }
        Livro livro = buscarLivroPorISBN(isbn);

        if (livro == null) {
            System.out.println("Livro não encontrado.");
            return;
        }

        for (int i=0; i < livros.size();i++) {
            if (livros.get(i).getIsbn() == isbn) {
                System.out.println("Livro : " + livros.get(i).getTitulo() + " foi removido com sucesso");
                livros.remove(i);
            }
        }
    }
    public Livro buscarLivroPorISBN(int isbn) {
        for (Livro livro : livros) {
            if (livro.getIsbn() == isbn) {
                return livro;
            }
        }
        System.out.println("Livro não encontrado.");
        return null;
    }

    public void editarLivro() {
        int isbn;
        while (true) {
            try {
                System.out.println("Digite o ISBN do livro que deseja editar: ");
                isbn = scanner.nextInt();
                scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro: ISBN inválido! Digite apenas números inteiros.");
                scanner.nextLine();
            }
        }
        Livro livro = buscarLivroPorISBN(isbn);

        if (livro == null) {
            System.out.println("Livro não encontrado.");
            return;
        }

        int opcao;
        do {
            System.out.println("\n===== MENU EDITAR LIVRO =====");
            System.out.println("1 - Editar Título");
            System.out.println("2 - Editar Autor");
            System.out.println("3 - Editar ISBN");
            System.out.println("4 - Editar Editora");
            System.out.println("5 - Editar Gênero");
            System.out.println("6 - Editar Número de páginas");
            System.out.println("7 - Editar Quantidade");
            System.out.println("8 - Retornar");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Novo Título: ");
                    livro.setTitulo(scanner.nextLine());
                    break;
                case 2:
                    System.out.print("Novo Autor: ");
                    livro.setAutor(scanner.nextLine());
                    break;
                case 3:
                    System.out.print("Novo ISBN: ");
                    livro.setIsbn(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 4:
                    System.out.print("Nova Editora: ");
                    livro.setEditora(scanner.nextLine());
                    break;
                case 5:
                    System.out.print("Novo Gênero: ");
                    livro.setGenero(scanner.nextLine());
                    break;
                case 6:
                    System.out.print("Novo Número de Páginas: ");
                    livro.setNumero_paginas(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 7:
                    System.out.print("Nova Quantidade: ");
                    livro.setQuantidade(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 8:
                    System.out.println("Voltando ao menu...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 8);
    }

    public void listarLivros() {
        for (int i = 0; i < livros.size(); i++) {
            Livro livro = livros.get(i);
            System.out.println("Índice: " + i);
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("ISBN: " + livro.getIsbn());
            System.out.println("Editora: " + livro.getEditora());
            System.out.println("Gênero: " + livro.getGenero());
            System.out.println("Número de Páginas: " + livro.getNumero_paginas());
            System.out.println("Quantidade: " + livro.getQuantidade());
            System.out.println("-----------------------------");
        }
    }

    public void adicionarPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
        System.out.println("Pessoa: " + pessoa.getNome() + " foi cadastrada com sucesso!");
    }

    public void listarPessoas() {
        for (int i =0; i < pessoas.size();i++) {
            Pessoa pessoa = pessoas.get(i);
            System.out.println("Índice: " + i);
            System.out.println("Código: " + pessoa.getCodigo());
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println("-----------------------------");

        }
    }

    public Pessoa buscarPessoaPorCodigo(int codigo) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getCodigo() == codigo) {
                return pessoa;
            }
        }
        System.out.println("Pessoa não encontrada.");
        return null;
    }

    public void editarPessoa() {
        int codigo;
        while (true) {
            try {
                System.out.println("Digite o CÓDIGO da pessoa que deseja editar: ");
                codigo = scanner.nextInt();
                scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro: CÓDIGO inválido! Digite apenas números inteiros.");
                scanner.nextLine();
            }
        }
        Pessoa pessoa = buscarPessoaPorCodigo(codigo);

        if (pessoa == null) {
            System.out.println("Pessoa não encontrada.");
            return;
        }
        int opcao;
        do {
            System.out.println("1 - Editar Nome: ");
            System.out.println("2 - Editar Idade: ");
            System.out.println("3 - Retornar ");

            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("Novo nome: ");
                    pessoa.setNome(scanner.nextLine());
                    break;
                case 2:
                    System.out.println("Nova idade:");
                    pessoa.setIdade(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.println("Retornando");
                    break;
            }
        } while (opcao != 3);
    }

    public void removerPessoa() {
        int codigo;
        while (true) {
            try {
                System.out.println("Digite o CÓDIGO da pessoa que deseja editar: ");
                codigo = scanner.nextInt();
                scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro: CÓDIGO inválido! Digite apenas números inteiros.");
                scanner.nextLine();
            }
        }
        Pessoa pessoa = buscarPessoaPorCodigo(codigo);

        if (pessoa == null) {
            System.out.println("Pessoa não encontrada.");
            return;
        }
        for (int i=0; i < pessoas.size();i++) {
            if (pessoas.get(i).getCodigo() == codigo) {
                pessoas.remove(i);

            }
            System.out.println("Pessoa: " + pessoas.get(i).getNome() + " foi excluída com sucesso");
        }

    }
}

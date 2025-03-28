package Biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Livro> livros;

    public Estoque(){
        this.livros = new ArrayList<>();

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

    public void removerLivro(int isbn) {
        for (int i =0; i < livros.size();i++) {
            if (livros.get(i).getIsbn() == isbn) {
                livros.remove(i);
                System.out.println("Livro : " + livros.get(i).getTitulo() + " foi removido com sucesso");
            }
        }
    }
    public Livro encontrarLivro(int isbn) {
        for (Livro livro : livros) {
            if (livro.getIsbn() == isbn) {
                return livro;
            }
        }
        return null;
    }

    public void atualizarCampo(int isbn, String campo) {
        Livro livro = encontrarLivro(isbn);

        if (livro == null) {
            System.out.println("Não existe livro com esse ISBN.");
            return;
        }

        System.out.println("Livro encontrado: " + livro.getTitulo());
        System.out.print("Digite o novo " + campo + ": ");

        switch (campo.toLowerCase()) {
            case "titulo":
                scanner.nextLine();
                livro.setTitulo(scanner.nextLine());
                break;
            case "autor":
                scanner.nextLine();
                livro.setAutor(scanner.nextLine());
                break;
            case "isbn":
                livro.setIsbn(scanner.nextInt());
                scanner.nextLine();
                break;
            case "editora":
                scanner.nextLine();
                livro.setEditora(scanner.nextLine());
                break;
            case "genero":
                scanner.nextLine();
                livro.setGenero(scanner.nextLine());
                break;
            case "numero de paginas":
                livro.setNumero_paginas(scanner.nextInt());
                scanner.nextLine();
                break;
            case "quantidade":
                livro.setQuantidade(scanner.nextInt());
                scanner.nextLine();
                break;
            default:
                System.out.println("Campo inválido.");
                return;
        }

        System.out.println(campo + " alterado com sucesso!");
    }
    public void atualizarTitulo(int isbn) {
        atualizarCampo(isbn, "titulo");
    }

    public void atualizarAutor(int isbn) {
        atualizarCampo(isbn, "autor");
    }

    public void atualizarISBN(int isbn) {
        atualizarCampo(isbn, "isbn");
    }

    public void atualizarEditora(int isbn) {
        atualizarCampo(isbn, "editora");
    }

    public void atualizarGenero(int isbn) {
        atualizarCampo(isbn, "genero");
    }

    public void atualizarPaginas(int isbn) {
        atualizarCampo(isbn, "numero_paginas");
    }

    public void atualizarQuant(int isbn) {
        atualizarCampo(isbn, "quantidade");
    }

    public void listarLivros() {
        for(Livro livro : livros) {
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("ISBN: " + livro.getIsbn());
            System.out.println("Editora: " + livro.getEditora());
            System.out.println("Gênero: " + livro.getGenero());
            System.out.println("Número de Páginas: " + livro.getNumero_paginas());
            System.out.println("Quantidade: " + livro.getQuantidade());
        }
    }
}

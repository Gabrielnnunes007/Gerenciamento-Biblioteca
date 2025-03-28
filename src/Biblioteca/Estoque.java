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

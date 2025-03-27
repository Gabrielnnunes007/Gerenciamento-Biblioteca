package Biblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private int isbn;
    private String editora;
    private String genero;
    private int numero_paginas;
    private int quantidade;

    public Livro() {

    }
    public Livro(String titulo, String autor, int isbn, String editora, String genero, int numero_paginas, int quantidade) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setIsbn(isbn);
        this.setEditora(editora);
        this.setGenero(genero);
        this.setNumero_paginas(numero_paginas);
        this.setQuantidade(quantidade);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumero_paginas() {
        return numero_paginas;
    }

    public void setNumero_paginas(int numero_paginas) {
        this.numero_paginas = numero_paginas;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}

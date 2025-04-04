package Biblioteca;

public class Pessoa {
    private static int contador = 1;
    private String nome;
    private int idade;
    private int codigo;

    public Pessoa() {
        this.setCodigo(contador++);
    }
    public Pessoa (String nome, int idade) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setCodigo(contador++);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}

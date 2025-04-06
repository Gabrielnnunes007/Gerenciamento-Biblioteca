package Biblioteca;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Emprestimo {
    public Pessoa pessoa;
    public Livro livro;
    private LocalDateTime dataImprestimo;
    private int diasDeEmprestimo;
    private ArrayList<Emprestimo> emprestimos;

    public Emprestimo() {
        this.emprestimos = new ArrayList<>();
    }

    public Emprestimo(Pessoa pessoa, Livro livro, int diasDeEmprestimo, LocalDateTime dataImprestimo) {
        this.setDiasDeEmprestimo(diasDeEmprestimo);
        this.dataImprestimo = LocalDateTime.now();
    }

    public int verificarDiasEmprestimo(Pessoa pessoa) {
        if (pessoa.getIdade() > 0 && pessoa.getIdade() <= 20) {
            diasDeEmprestimo = 15;
        } else if (pessoa.getIdade() > 20 && pessoa.getIdade() <= 40) {
            diasDeEmprestimo = 30;
        } else if (pessoa.getIdade() > 40) {
            diasDeEmprestimo = 45;
        } else {
            diasDeEmprestimo = 7;
        }
        return diasDeEmprestimo;
    }

    public void adicionarEmprestimo(Pessoa pessoa, Livro livro) {
        if (livro.getQuantidade() <= 0) {
            System.out.println("Impossivel realizar o emprestimo. Sem estoque");
        } else {
            livro.setQuantidade(livro.getQuantidade() - 1);
            verificarDiasEmprestimo(pessoa);
            emprestimos.add(new Emprestimo(pessoa, livro, diasDeEmprestimo, dataImprestimo));
            System.out.println("Empréstimo realizado com sucesso");
            System.out.println(pessoa.getNome() + " pegou o livro: " + livro.getTitulo() + " emprestado por: " + diasDeEmprestimo + " dias");
        }
    }

    public void listarEmprestimos() {
        for (Emprestimo emprestimo :emprestimos) {

        }
    }


    public LocalDateTime getDataImprestimo() {
        return dataImprestimo;
    }

    public void setDataImprestimo(LocalDateTime dataImprestimo) {
        this.dataImprestimo = dataImprestimo;
    }

    public ArrayList<Emprestimo> getEmprestimos() {
        return (ArrayList<Emprestimo>) emprestimos;
    }

    public void setEmprestimos(ArrayList<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public int getDiasDeEmprestimo() {
        return diasDeEmprestimo;
    }

    public void setDiasDeEmprestimo(int diasDeEmprestimo) {
        this.diasDeEmprestimo = diasDeEmprestimo;
    }
}

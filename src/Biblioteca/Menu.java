package Biblioteca;

public class Menu {
    public void menuPrincipal() {
        System.out.println("-----  Sistema de Gerenciamento da Biblioteca -----");
        System.out.println("Selecione a opção desejada: ");
        System.out.println("1 - LIVRO");
        System.out.println("2 - PESSOA");
        System.out.println("3 - EMPRESTIMOS");
        System.out.println("4 - ENCERRAR\n");
    }
    public void menuLivro() {
        System.out.println("------ MENU LIVRO -------");
        System.out.println("Selecione a opção desejada: ");
        System.out.println("1 - Cadastrar Livros");
        System.out.println("2 - Editar Livros");
        System.out.println("3 - Remover Livros");
        System.out.println("4 - Listar Livros");
        System.out.println("5 - Retornar ao Menu principal\n");
    }

    public void menuPessoa() {
        System.out.println("------ MENU PESSOA ------");
        System.out.println("Selecione a opção desejada: ");
        System.out.println("1 - Cadastrar Pessoa");
        System.out.println("2 - Editar Pessoa");
        System.out.println("3 - Remover Pessoa");
        System.out.println("4 - Listar Pessoas");
        System.out.println("5 - Retornar ao Menu principal\n");
    }

    public void menuEmpretimo() {
        System.out.println("------ MENU EMPRESTIMO -------");
        System.out.println("Selecione a opção desejada: ");
        System.out.println("1 - Exbir todos os Empréstimos");
        System.out.println("2 - Editar Empréstimos");
        System.out.println("3 - Adicionar Empréstimo");
        System.out.println("4 - Remover Empréstimo");
        System.out.println("5 - Retornar ao Menu principal\n");
    }
}

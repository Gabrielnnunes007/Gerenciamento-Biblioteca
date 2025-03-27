package Biblioteca;

public class Sistema {
    public void menuPrincipal() {
        System.out.println("-----  Sistema de Gerenciamento da Biblioteca -----");
        System.out.println("Selecione a opção desejada: ");
        System.out.println("1 - LIVRO");
        System.out.println("2 - USUÁRIO");
        System.out.println("3 - ESTOQUE");
        System.out.println("4 - EMPRESTIMOS");
        System.out.println("5 - ENCERRAR\n");
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
    public void menuUsuario() {
        System.out.println("------ MENU USUARIO ------");
        System.out.println("Selecione a opção desejada: ");
        System.out.println("1 - Cadastrar Usuário");
        System.out.println("2 - Editar Usuário");
        System.out.println("3 - Remover Usuário");
        System.out.println("4 - Listar Usuários");
        System.out.println("5 - Retornar ao Menu principal\n");
    }
    public void menuEstoque() {
        System.out.println("------ MENU ESTOQUE ------");
        System.out.println("Selecione a opção desejada: ");
    }
    public void menuEmpretimo() {
        System.out.println("------ MENU EMPRESTIMO -------");
        System.out.println("Selecione a opção desejada: ");
    }
}

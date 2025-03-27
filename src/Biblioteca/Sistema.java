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
    public void menuEditarLivro() {
        System.out.println("1 - Editar Título");
        System.out.println("2 - Editar Autor");
        System.out.println("3 - Editar ISBN");
        System.out.println("4 - Editar Editora");
        System.out.println("5 - Editar Gênero");
        System.out.println("6 - Editar Número de páginas");
        System.out.println("7 - Editar Quantidade");
        System.out.println("8 - Retornar");

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


package Exercicio7;

public class Livro {
    
    private String titulo;
    private Autor autor;
    private int emprestimos;

    public Livro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void registrarEmprestimo() {
        emprestimos++;
    }

    public int getEmprestimos() {
        return emprestimos;
    }

    @Override
    public String toString() {
        return titulo + " (" + autor.getNome() + ")";
    }

   
    }


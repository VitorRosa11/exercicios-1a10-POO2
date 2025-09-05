
package Exercicio7;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    
    private String nome;
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public Usuario(String nome) {
        this.nome = nome;
    }

    public void emprestar(Livro livro, int dias) {
        emprestimos.add(new Emprestimo(this, livro, dias));
    }

    public void listarEmprestimos() {
        System.out.println("Empréstimos de " + nome + ":");
        for (Emprestimo e : emprestimos) {
            System.out.println("- " + e.getLivro() + " | Multa: R$" + e.calcularMulta());
        }
    }
    
}

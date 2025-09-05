
package Exercicio7;

import java.time.LocalDate;


public class Emprestimo {
    
    private Usuario usuario;
    private Livro livro;
    private LocalDate dataDevolucao;

    public Emprestimo(Usuario usuario, Livro livro, int dias) {
        this.usuario = usuario;
        this.livro = livro;
        this.dataDevolucao = LocalDate.now().plusDays(dias);
        livro.registrarEmprestimo();
    }

    public double calcularMulta() {
        long atraso = LocalDate.now().toEpochDay() - dataDevolucao.toEpochDay();
        return atraso > 0 ? atraso * 2.0 : 0;
    }

    public Livro getLivro() {
        return livro;
    }

}

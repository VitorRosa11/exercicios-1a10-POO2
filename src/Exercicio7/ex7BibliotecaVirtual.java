
package Exercicio7;

import java.util.Arrays;
import java.util.List;

public class ex7BibliotecaVirtual {
    
    public static void main(String[] args) {
        
        Autor a1 = new Autor("J.K.Rowling");
        Livro l1 = new Livro("Harry Potter e a Pedra Filosofal", a1);
        Livro l2 = new Livro("Harry Potter e o Cálice de Fogo", a1);

        Usuario u1 = new Usuario("Ana");
        u1.emprestar(l1, 7);
        u1.emprestar(l2, 2);

        u1.listarEmprestimos();

       
        List<Livro> livros = Arrays.asList(l1, l2);
        livros.sort((x, y) -> Integer.compare(y.getEmprestimos(), x.getEmprestimos()));

        System.out.println("\nLivros mais populares:");
        for (Livro l : livros) {
            System.out.println(l + " - " + l.getEmprestimos() + " empréstimos");
        
}
    }
}

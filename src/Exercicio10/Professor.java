
package Exercicio10;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    
    private String nome;
    private List<Disciplina> disciplinas = new ArrayList<>();

    public Professor(String nome) {
        this.nome = nome;
    }

    public void adicionarDisciplina(Disciplina d) {
        disciplinas.add(d);
    }

    public void listarCursos() {
        System.out.println("Cursos do professor " + nome + ":");
        for (Disciplina d : disciplinas) {
            System.out.println("- " + d);
        }
    }

    public String getNome() {
        return nome;
    }
    
}

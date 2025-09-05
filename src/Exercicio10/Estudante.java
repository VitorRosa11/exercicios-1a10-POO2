package Exercicio10;

import java.util.ArrayList;
import java.util.List;

public class Estudante {
    
     private String nome;
    private List<Disciplina> disciplinas = new ArrayList<>();

    public Estudante(String nome) {
        this.nome = nome;
    }

    public void matricular(Disciplina d) {
        disciplinas.add(d);
    }

    public double calcularMedia() {
        return disciplinas.stream().mapToDouble(Disciplina::getNota).average().orElse(0);
    }

    @Override
    public String toString() {
        return nome + " - Média: " + calcularMedia();
    }
}

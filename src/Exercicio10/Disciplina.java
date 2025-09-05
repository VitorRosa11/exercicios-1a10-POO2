
package Exercicio10;

public class Disciplina {
    
    private String nome;
    private double nota;
    private Professor professor;

    public Disciplina(String nome, double nota, Professor professor) {
        this.nome = nome;
        this.nota = nota;
        this.professor = professor;
        professor.adicionarDisciplina(this);
    }

    public double getNota() {
        return nota;
    }

    public Professor getProfessor() {
        return professor;
    }

    @Override
    public String toString() {
        return nome + " (" + professor.getNome() + ")";
    }
}

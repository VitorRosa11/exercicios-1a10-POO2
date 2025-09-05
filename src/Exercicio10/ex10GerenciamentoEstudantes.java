package Exercicio10;

public class ex10GerenciamentoEstudantes {
    
    public static void main(String[] args) {
        
        Professor p1 = new Professor("André");

        Disciplina d1 = new Disciplina("Biomecânica", 8.5, p1);
        Disciplina d2 = new Disciplina("Metodologia Científica", 9.0, p1);

        Estudante e1 = new Estudante("Vitor");
        e1.matricular(d1);
        e1.matricular(d2);

        System.out.println(e1);
        p1.listarCursos();
    
    }
}

package Exercicio10;

public class ex10GerenciamentoEstudantes {
    
    public static void main(String[] args) {
        
        Professor p1 = new Professor("Andr�");

        Disciplina d1 = new Disciplina("Biomec�nica", 8.5, p1);
        Disciplina d2 = new Disciplina("Metodologia Cient�fica", 9.0, p1);

        Estudante e1 = new Estudante("Vitor");
        e1.matricular(d1);
        e1.matricular(d2);

        System.out.println(e1);
        p1.listarCursos();
    
    }
}

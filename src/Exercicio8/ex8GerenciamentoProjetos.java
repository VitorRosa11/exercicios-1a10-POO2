package Exercicio8;

import Exercicio2.Projeto;

public class ex8GerenciamentoProjetos {
    public static void main(String[] args) {
        
        Projeto p1 = new Projeto("Sistema Web");

        Desenvolvedor d1 = new Desenvolvedor("Lucas");
        Desenvolvedor d2 = new Desenvolvedor("Filippe");

        Tarefa t1 = new Tarefa("Back-end");
        Tarefa t2 = new Tarefa("Banco de dados");
        Tarefa t3 = new Tarefa("Frond-end");

        p1.adicionarTarefa(t1);
        p1.adicionarTarefa(t2);
        p1.adicionarTarefa(t3);

        t1.atribuir(d1);
        t2.atribuir(d2);

        System.out.println(p1);

        d1.listarTarefas();
        d2.listarTarefas();
    
    }
}

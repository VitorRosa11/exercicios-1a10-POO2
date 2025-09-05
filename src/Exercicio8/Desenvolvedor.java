
package Exercicio8;

import java.util.ArrayList;
import java.util.List;

public class Desenvolvedor {
    
    private String nome;
    private List<Tarefa> tarefas = new ArrayList<>();

    public Desenvolvedor(String nome) {
        this.nome = nome;
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void listarTarefas() {
        System.out.println("Tarefas de " + nome + ":");
        for (Tarefa t : tarefas) {
            System.out.println("- " + t);
        }
    }

    public String getNome() {
        return nome;
    }
}

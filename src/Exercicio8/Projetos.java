
package Exercicio8;

import java.util.ArrayList;
import java.util.List;

public class Projetos {
    
     private String nome;
    private List<Tarefa> tarefas = new ArrayList<>();

    public Projetos(String nome) {
        this.nome = nome;
    }

    public void adicionarTarefa(Tarefa t) {
        tarefas.add(t);
    }

    public int getCargaDeTrabalho() {
        return tarefas.size();
    }

    @Override
    public String toString() {
        return nome + " - " + getCargaDeTrabalho() + " tarefas";
    }
}

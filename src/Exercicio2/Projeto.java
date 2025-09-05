
package Exercicio2;

import Exercicio8.Tarefa;

public class Projeto {
    
    private String nome;

    public Projeto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Projeto: " + nome;
    }

    public void adicionarTarefa(Tarefa t1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}

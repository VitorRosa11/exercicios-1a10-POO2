
package Exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
     private String nome;
    private List<Funcionarios> funcionarios = new ArrayList<>();

    public Departamento(String nome) {
        this.nome = nome;
    }

    public void adicionarFuncionario(Funcionarios f) {
        funcionarios.add(f);
    }

    public double mediaSalarial() {
        if (funcionarios.isEmpty()) return 0;
        double soma = 0;
        for (Funcionarios f : funcionarios) {
            soma += f.getSalario();
        }
        return soma / funcionarios.size();
    }

    @Override
    public String toString() {
        return "Departamento " + nome + " (" + funcionarios.size() + " funcionários)";
    }
}


package Exercicio2;

import java.util.ArrayList;
import java.util.List;
        
public class Funcionarios {
    private String nome;
     private double salario;
    private List<Projeto> projetos = new ArrayList<>();

    public Funcionarios String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void adicionarProjeto(Projeto projeto) {
        projetos.add(projeto);
    }

    public List<Projeto> getProjetos() {
        return projetos;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return nome + " - Salário: " + salario;
    }
    
   }
    
     
            
      

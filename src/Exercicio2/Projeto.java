
package Exercicio2;

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

    
}

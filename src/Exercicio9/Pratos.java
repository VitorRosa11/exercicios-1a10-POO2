
package Exercicio9;


public class Pratos {
    
      private String nome;
    private double preco;

    public Pratos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return nome + " - R$" + preco;
    }
}

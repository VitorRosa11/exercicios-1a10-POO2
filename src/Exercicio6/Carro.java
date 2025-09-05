
package Exercicio6;

public class Carro {
     private String modelo;
    private double preco;
    private Marca marca;
    private Vendedor vendedor;

    public Carro(String modelo, double preco, Marca marca) {
        this.modelo = modelo;
        this.preco = preco;
        this.marca = marca;
    }

    public void venderPara(Vendedor vendedor) {
        this.vendedor = vendedor;
        vendedor.registrarVenda(this);
    }

    public double getPreco() {
        return preco;
    }

    public Marca getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return modelo + " - R$" + preco + " (" + marca.getNome() + ")";
    }
}

package Exercicio9;

import java.util.ArrayList;
import java.util.List;

public class Pedidos {
    
    private Mesas mesa;
    private List<Pratos> pratos = new ArrayList<>();

    public Pedidos(Mesas mesa) {
        this.mesa = mesa;
    }

    public void adicionarPrato(Pratos prato) {
        pratos.add(prato);
    }

    public double calcularTotal() {
        return pratos.stream().mapToDouble(Pratos::getPreco).sum();
    }

    @Override
    public String toString() {
        return "Pedido da mesa " + mesa.getNumero() + " - Total: R$" + calcularTotal();
    }
}

package Exercicio6;

import java.util.ArrayList;
import java.util.List;

public class Vendedor {
    
     private String nome;
    private List<Carro> carrosVendidos = new ArrayList<>();

    public Vendedor(String nome) {
        this.nome = nome;
    }

    public void registrarVenda(Carro carro) {
        carrosVendidos.add(carro);
    }

    public void listarVendas() {
        System.out.println("Carros vendidos por " + nome + ":");
        for (Carro c : carrosVendidos) {
            System.out.println("- " + c);
        }
    }
    
}

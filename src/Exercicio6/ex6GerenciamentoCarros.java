
package Exercicio6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ex6GerenciamentoCarros {
    
    public static void main(String[] args) {
        Marca nissan = new Marca("NISSAN");
        Marca chevrolet = new Marca("CHEVROLET");

        Carro c1 = new Carro("VERSA", 120000, nissan);
        Carro c2 = new Carro("ONIX PLUS", 110000, chevrolet);
        Carro c3 = new Carro("KICKS", 250000, nissan);

        Vendedor v1 = new Vendedor("Carlos");

        c1.venderPara(v1);
        c3.venderPara(v1);

        v1.listarVendas();

        List<Carro> estoque = Arrays.asList(c1, c2, c3);
        calcularMediaPorMarca(estoque);
    }

    static void calcularMediaPorMarca(List<Carro> carros) {
        Map<String, List<Double>> mapa = new HashMap<>();
        for (Carro c : carros) {
            mapa.putIfAbsent(c.getMarca().getNome(), new ArrayList<>());
            mapa.get(c.getMarca().getNome()).add(c.getPreco());
        }

        System.out.println("\nMédia de preços por marca:");
        for (String marca : mapa.keySet()) {
            double media = mapa.get(marca).stream().mapToDouble(Double::doubleValue).average().orElse(0);
            System.out.println(marca + ": R$" + media);
        }
    }
}

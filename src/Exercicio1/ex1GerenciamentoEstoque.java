
package Exercicio1;

import java.util.ArrayList;
import java.util.List;


public class ex1GerenciamentoEstoque {
    
    public static void main (String[] args){
        
    List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Teclado", 2, 5));
        produtos.add(new Produto("Mouse", 10, 3));
        produtos.add(new Produto("Monitor", 1, 2));

        Fornecedor fornecedor = new Fornecedor("UltraTech");

        Pedido pedido = new Pedido(fornecedor);
        pedido.adicionarProduto(produtos.get(0), 10); 
        pedido.adicionarProduto(produtos.get(2), 5);

        System.out.println(pedido);

        System.out.println("\nProdutos com estoque baixo:");
        for (Produto p : produtos) {
            if (p.estoqueBaixo()) {
                System.out.println(p);
            }
        }
        
        System.out.println("\nEstoque final:");
        for (Produto p : produtos) {
            System.out.println(p);
        }
    }
}
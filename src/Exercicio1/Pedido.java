
package Exercicio1;

import java.util.ArrayList;
import java.util.List;

class Pedido {
   
    private Fornecedor fornecedor;
    private List<Produto> produtos = new ArrayList<>();

    public Pedido(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void adicionarProduto(Produto produto, int qtd) {
        produto.adicionarEstoque(qtd);
        produtos.add(produto);
    }

    @Override
    public String toString() {
        return "Pedido do " + fornecedor.getNome() + " com " + produtos.size() + " produtos.";
    }
}

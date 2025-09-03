
package Exercicio1;



class Produto {
    
    private String nome;
    private int quantidade;
    private int estoqueMinimo;

    public Produto(String nome, int quantidade, int estoqueMinimo) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.estoqueMinimo = estoqueMinimo;
    }

    public void adicionarEstoque(int qtd) {
        this.quantidade += qtd;
    }

    public boolean estoqueBaixo() {
        return quantidade <= estoqueMinimo;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return nome + " (Quantidade: " + quantidade + ")";
    }
}



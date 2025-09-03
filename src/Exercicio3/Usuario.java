
package Exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
 
    private String nome;
    private List<Publicacao> publicacoes = new ArrayList<>();

    public Usuario(String nome) {
        this.nome = nome;
    }

    public void criarPublicacao(String texto) {
        Publicacao pub = new Publicacao(this, texto);
        publicacoes.add(pub);
    }

    public List<Publicacao> getPublicacoes() {
        return publicacoes;
    }

    @Override
    public String toString() {
        return "Usuário: " + nome;
    }
}

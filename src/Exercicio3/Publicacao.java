
package Exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Publicacao {
    private Usuario autor;
    private String texto;
    private List<Comentario> comentarios = new ArrayList<>();

    public Publicacao(Usuario autor, String texto) {
        this.autor = autor;
        this.texto = texto;
    }

    public void adicionarComentario(Usuario usuario, String texto) {
        comentarios.add(new Comentario(usuario, texto));
    }

    @Override
    public String toString() {
        return autor + "\n MENSAGEM:\"" + texto + "\" (" + comentarios.size() + " comentário(s)";
    }
    
}


package Exercicio3;



public class Comentario {
    
     private Usuario autor;
    private String texto;

    public Comentario(Usuario autor, String texto) {
        this.autor = autor;
        this.texto = texto;
    }

    @Override
    public String toString() {
        return autor + " comentou: " + texto;
    }
}

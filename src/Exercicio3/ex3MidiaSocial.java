
package Exercicio3;


public class ex3MidiaSocial {
    
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Vitor");
        Usuario u2 = new Usuario("Vin�cius");

        u1.criarPublicacao("E a� mano, blz?");
        u2.criarPublicacao("Opa tudo certo");

        Publicacao pub = u1.getPublicacoes().get(0);
        pub.adicionarComentario(u2, "Vamos no cinema amanh�.");

        System.out.println("Publica��es de " + u1 + ":");
        for (Publicacao p : u1.getPublicacoes()) {
            System.out.println(p);
        }
    }
}

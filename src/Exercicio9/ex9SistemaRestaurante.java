
package Exercicio9;

import java.time.LocalDate;

public class ex9SistemaRestaurante {
    
    public static void main(String[] args) {
        Pratos p1 = new Pratos("Hambúrguer Artesanal", 40);
        Pratos p2 = new Pratos("Ala Minuta", 75);

        Mesas m1 = new Mesas(1);
        m1.reservarPara(LocalDate.now().plusDays(1));

        Pedidos pedido = new Pedidos(m1);
        pedido.adicionarPrato(p1);
        pedido.adicionarPrato(p2);

        System.out.println(pedido);

        System.out.println("Reserva da mesa " + m1.getNumero() + " para " + m1.getReserva());
    
    }
}

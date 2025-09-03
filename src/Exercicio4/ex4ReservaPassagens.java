
package Exercicio4;


public class ex4ReservaPassagens {

    public static void main(String[] args) {
        
        Passageiro p1 = new Passageiro("Vitor");
        Voo v1 = new Voo("AZ123", 2);

        if (v1.reservarLugar()) {
            Reserva r1 = new Reserva(p1, v1);
            p1.adicionarReserva(r1);
            System.out.println("Reserva feita: " + r1);
        }

        System.out.println("Reservas de " + p1 + ":");
        for (Reserva r : p1.getReservas()) {
            System.out.println(r);
        }

        System.out.println("STATUS DO VOO:\n " + v1);
    
    }
    
}

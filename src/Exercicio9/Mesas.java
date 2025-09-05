
package Exercicio9;

import java.time.LocalDate;

public class Mesas {
     
     private int numero;
    private LocalDate reserva;

    public Mesas(int numero) {
        this.numero = numero;
    }

    public void reservarPara(LocalDate data) {
        this.reserva = data;
    }

    public LocalDate getReserva() {
        return reserva;
    }

    public int getNumero() {
        return numero;
    }
   
}

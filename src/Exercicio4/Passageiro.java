
package Exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Passageiro {
  
    private String nome;
    private List<Reserva> reservas = new ArrayList<>();

    public Passageiro(String nome) {
        this.nome = nome;
    }

    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    @Override
    public String toString() {
        return "PASSAGEIRO: " + nome + ",";
    }

    
}

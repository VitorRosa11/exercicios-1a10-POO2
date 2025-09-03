
package Exercicio4;

public class Reserva {
    
     private Passageiro passageiro;
    private Voo voo;

    public Reserva(Passageiro passageiro, Voo voo) {
        this.passageiro = passageiro;
        this.voo = voo;
    }

    @Override
    public String toString() {
        return passageiro + " reservado no " + voo.getCodigo();
    }

}


package Exercicio4;

public class Voo {
    
    private String codigo;
    private int lugaresDisponiveis;

    public Voo(String codigo, int lugaresDisponiveis) {
        this.codigo = codigo;
        this.lugaresDisponiveis = lugaresDisponiveis;
    }

    public boolean reservarLugar() {
        if (lugaresDisponiveis > 0) {
            lugaresDisponiveis--;
            return true;
        }
        return false;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Voo " + codigo + " - Lugares disponíveis: " + lugaresDisponiveis;
    }
}

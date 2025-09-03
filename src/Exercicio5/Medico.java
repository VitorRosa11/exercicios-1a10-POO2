package Exercicio5;

import java.util.ArrayList;
import java.util.List;

public class Medico {
    
     private String nome;
    private List<Consulta> consultas = new ArrayList<>();

    public Medico(String nome) {
        this.nome = nome;
    }

    public void adicionarConsulta(Consulta c) {
        consultas.add(c);
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    @Override
    public String toString() {
        return "Dr(a). " + nome;
    }
}

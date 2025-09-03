package Exercicio5;

import java.time.LocalDate;

public class ex5GerenciamentoClinica {
 
    public static void main(String[] args) {
        
        Medico m1 = new Medico("Rodrigo");
        Paciente p1 = new Paciente("Felipe");

        Consulta c1 = new Consulta(m1, p1, LocalDate.now().plusDays(2));
        m1.adicionarConsulta(c1);

        System.out.println("Consultas do " + m1 + ":");
        for (Consulta c : m1.getConsultas()) {
            System.out.println(c);
        }
    }
}

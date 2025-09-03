
package Exercicio5;

import java.time.LocalDate;

public class Consulta {
    
    private Medico medico;
    private Paciente paciente;
    private LocalDate data;

    public Consulta(Medico medico, Paciente paciente, LocalDate data) {
        this.medico = medico;
        this.paciente = paciente;
        this.data = data;
    }

    @Override
    public String toString() {
        return data + " - " + medico + " com " + paciente;
    }
}

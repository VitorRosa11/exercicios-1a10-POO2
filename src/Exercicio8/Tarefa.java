package Exercicio8;


public class Tarefa {

 private String descricao;
    private Desenvolvedor responsavel;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public void atribuir(Desenvolvedor d) {
        this.responsavel = d;
        d.adicionarTarefa(this);
    }

    @Override
    public String toString() {
        return descricao + " -> " + (responsavel != null ? responsavel.getNome() : "Sem responsável");
    }    
}

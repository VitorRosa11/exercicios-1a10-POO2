
package Exercicio2;


public class Ex2GerenciamentoFuncionarios {
    
    public static void main(String[] args) {
        Departamento depTI = new Departamento("TI");

        Funcionarios f1 = new Funcionarios("Ana", 3000);
        Funcionarios f2 = new Funcionarios("Carlos", 4000);

        Projeto p1 = new Projeto("Sistema de Estoque");
        Projeto p2 = new Projeto("App Mobile");

        f1.adicionarProjeto(p1);
        f2.adicionarProjeto(p1);
        f2.adicionarProjeto(p2);

        depTI.adicionarFuncionario(f1);
        depTI.adicionarFuncionario(f2);

        System.out.println(depTI);
        System.out.println("Média Salarial: " + depTI.mediaSalarial());

        System.out.println("\nProjetos de " + f2 + ":");
        for (Projeto p : f2.getProjetos()) {
            System.out.println(p);
        }
    }
}

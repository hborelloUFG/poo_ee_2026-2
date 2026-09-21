package associacoes.departamento;

public class Main {
    public static void main(String args[]) {
        // Criando os departamentos
        Departamento d1 = new Departamento("Instituto de Engenharia", "IE");
        Departamento d2 = new Departamento("Instituto de Computacao", "IC");

        // Criando os cursos
        Curso c1 = new Curso("Eletrica", "EE", d1);
        Curso c2 = new Curso("Engenharia de Software", "ES", d2);
        
        // Criando os alunos
        Aluno a1 = new Aluno("João Silva", "2021001", 2021, c1);
        Aluno a2 = new Aluno("Maria Souza", "2021002", 2021, c1);
        Aluno a3 = new Aluno("Carlos Oliveira", "2021003", 2021, c2);

        // Exibindo os objetos utilizando o método toString()
        System.out.println("Exibindo os objetos departamento:");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println("\nExibindo os objetos curso:");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("\nExibindo os objetos aluno:");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        
    }
    
}

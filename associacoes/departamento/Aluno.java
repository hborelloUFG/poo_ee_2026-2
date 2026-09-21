package associacoes.departamento;

public class Aluno {

    private String nome;
    private String matricula;
    private int ano;
    private Curso curso;

    // Construtor que inicializa os dados do objeto
    public Aluno(String nome, String matricula, int ano, Curso curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.ano = ano;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getAno() {
        return ano;
    }

    public Curso getCurso() {
        return curso;
    }

    public String toString() {
        return "Aluno: " + nome + "\nMatrícula: " + matricula + "\nAno: " + ano + "\nCurso: " + curso.getNome() + ", Departamento: " + curso.getDepartamento().getNome();
    }
    
}

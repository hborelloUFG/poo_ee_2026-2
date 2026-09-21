package associacoes.departamento;

public class Curso {

    private String nome;
    private String sigla;

    private Departamento departamento;

    // Construtor que inicializa os dados do objeto
    public Curso(String nome, String sigla, Departamento departamento) {
        this.nome = nome;
        this.sigla = sigla;
        this.departamento = departamento;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public String toString() {
        return "Curso: " + nome + ", Sigla: " + sigla + ", Departamento: " + departamento.getNome();
    }

}

package atividades.a05associacoes.departamento;

public class Departamento {

    private String nome;
    private String sigla;

    // Construtor que inicializa os dados do objeto
    public Departamento(String nome, String sigla) {
        this.nome = nome;        
        this.sigla = sigla;
    }

    // Getters
    public String getNome() {
        return nome;    
    }

    public String getSigla() {
        return sigla;
    }

    public String toString() {
        return "Departamento: " + nome + ", Sigla: " + sigla;
    }
    
}

package atividades.a05associacoes.musica;

class Compositor {
    private String nome;
    private String nacionalidade;

    // Construtor que inicializa os dados do objeto
    public Compositor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    @Override
    public String toString() {
        return nome + " (" + nacionalidade + ")";
    }
}
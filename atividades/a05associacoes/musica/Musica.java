package atividades.a05associacoes.musica;

import java.util.ArrayList;
import java.util.List;

class Musica {
    private String nome;
    private int ano;
    private String tipo;
    private List<Compositor> compositores; // Papel '- compositores' do diagrama (0..* ou *)

    // Construtor
    public Musica(String nome, int ano, String tipo) {
        this.nome = nome;
        this.ano = ano;
        this.tipo = tipo;
        this.compositores = new ArrayList<>();
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    public String getTipo() {
        return tipo;
    }

    public List<Compositor> getCompositores() {
        return compositores;
    }

    // Método para associar os compositores
    public void adicionarCompositor(Compositor compositor) {
        this.compositores.add(compositor);
    }

    @Override
    public String toString() {
        return "Música: " + nome + 
               "\nAno: " + ano + 
               "\nTipo: " + tipo + 
               "\nCompositores: " + compositores;
    }
}